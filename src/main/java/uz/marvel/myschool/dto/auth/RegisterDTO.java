package uz.marvel.myschool.dto.auth;

import lombok.*;
import uz.marvel.myschool.domains.AuthUser;
import uz.marvel.myschool.util.Utils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RegisterDTO {
    private String username;
    private String password;
    private String confirmPassword;

    public AuthUser toDomain() {
        return AuthUser.builder()
                .username(this.username)
                .password(Utils.encodePassword(this.password))
                .build();
    }
}
