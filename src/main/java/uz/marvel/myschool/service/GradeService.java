package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.GradeDAO;
import uz.marvel.myschool.domains.Grade;
import uz.marvel.myschool.dto.GradeDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:23 (Wednesday)
 */
public class GradeService extends Service<GradeDAO> {
    public GradeService(GradeDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws IOException, ServletException {
        GradeDTO gradeDTO = toDTO.apply(req);
        Grade grade = toGradeDomain.apply(gradeDTO);
        dao.create(grade);
    }

    private static final Function<HttpServletRequest, GradeDTO> toDTO = GradeDTO::toDTO;
    private static final Function<GradeDTO, Grade> toGradeDomain = Grade::toDomain;

}
