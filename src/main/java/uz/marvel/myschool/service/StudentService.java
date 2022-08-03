package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.StudentDAO;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:03 (Wednesday)
 */
public class StudentService extends Service<StudentDAO> {
    public StudentService(StudentDAO dao) {
        super(dao);
    }
}
