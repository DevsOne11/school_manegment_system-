package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.ParentsDAO;
import uz.marvel.myschool.domains.Parents;
import uz.marvel.myschool.dto.ParentsDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:24 (Wednesday)
 */
public class ParentsService extends Service<ParentsDAO> {
    public ParentsService(ParentsDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws IOException, ServletException {
        ParentsDTO parentDTO = toDTO.apply(req);
        Parents parent = toParentsDomain.apply(parentDTO);
        dao.create(parent);
    }

    private static final Function<HttpServletRequest, ParentsDTO> toDTO = ParentsDTO::toDTO;
    private static final Function<ParentsDTO, Parents> toParentsDomain = Parents::toDomain;

}
