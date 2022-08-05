package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.TeacherDAO;
import uz.marvel.myschool.domains.Teacher;
import uz.marvel.myschool.dto.TeacherDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:25 (Wednesday)
 */
public class TeacherService extends Service<TeacherDAO> {
    public TeacherService(TeacherDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws IOException, ServletException {
        TeacherDTO teacherDTO = toDTO.apply(req);
        Teacher teacher = toTeacherDomain.apply(teacherDTO);
        dao.create(teacher);
    }

    private static final Function<HttpServletRequest, TeacherDTO> toDTO = TeacherDTO::toDTO;
    private static final Function<TeacherDTO, Teacher> toTeacherDomain = Teacher::toDomain;

}
