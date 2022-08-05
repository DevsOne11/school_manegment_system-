package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.StudentDAO;
import uz.marvel.myschool.domains.Grade;
import uz.marvel.myschool.domains.Student;
import uz.marvel.myschool.dto.GradeDTO;
import uz.marvel.myschool.dto.StudentDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:03 (Wednesday)
 */
public class StudentService extends Service<StudentDAO> {
    public StudentService(StudentDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws IOException, ServletException {
        StudentDTO studentDTO = toDTO.apply(req);
        Student student = toStudentDomain.apply(studentDTO);
        dao.create(student);
    }

    private static final Function<HttpServletRequest, StudentDTO> toDTO = StudentDTO::toDTO;
    private static final Function<StudentDTO, Student> toStudentDomain = Student::toDomain;

}
