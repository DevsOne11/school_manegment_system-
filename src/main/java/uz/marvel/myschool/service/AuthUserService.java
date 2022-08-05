package uz.marvel.myschool.service;

import lombok.NonNull;
import uz.marvel.myschool.dao.UserDAO;
import uz.marvel.myschool.domains.AuthUser;
import uz.marvel.myschool.dto.auth.RegisterDTO;
import uz.marvel.myschool.exceptions.BadRequestException;
import uz.marvel.myschool.util.Utils;

import java.util.Objects;

public class AuthUserService extends Service<UserDAO> {

    public AuthUserService(UserDAO dao) {
        super(dao);
    }


    public void create(@NonNull RegisterDTO dto) {

        if (Objects.isNull(dto.getPassword()))
            throw new BadRequestException("Password can not be null");

        if (!Objects.equals(dto.getPassword(), dto.getConfirmPassword()))
            throw new BadRequestException("Password did not match");

        AuthUser authUser = dto.toDomain();
        dao.create(authUser);
    }

    public AuthUser login(String username, String password) {
        AuthUser authUser = dao.findByUsername(username).orElseThrow(() -> {
            throw new BadRequestException("Bad credentials");
        });
        if (!Utils.matchPassword(password, authUser.getPassword())) {
            throw new BadRequestException("Bad credentials");
        }
        return authUser;
    }
}
