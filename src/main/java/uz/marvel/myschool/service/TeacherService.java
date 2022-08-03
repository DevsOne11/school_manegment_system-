package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.TeacherDAO;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:25 (Wednesday)
 */
public class TeacherService extends Service<TeacherDAO> {
    public TeacherService(TeacherDAO dao) {
        super(dao);
    }
}
