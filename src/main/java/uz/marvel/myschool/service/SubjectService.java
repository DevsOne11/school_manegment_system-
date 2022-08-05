package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.SubjectDAO;
import uz.marvel.myschool.domains.Subject;
import uz.marvel.myschool.dto.SubjectDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:24 (Wednesday)
 */
public class SubjectService extends Service<SubjectDAO> {
    public SubjectService(SubjectDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws IOException, ServletException {
        SubjectDTO subjectDTO = toDTO.apply(req);
        Subject subject = toSubjectDomain.apply(subjectDTO);
        dao.create(subject);
    }

    private static final Function<HttpServletRequest, SubjectDTO> toDTO = SubjectDTO::toDTO;
    private static final Function<SubjectDTO, Subject> toSubjectDomain = Subject::toDomain;

}
