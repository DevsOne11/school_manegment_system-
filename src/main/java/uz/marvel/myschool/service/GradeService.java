package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.GradeDAO;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:23 (Wednesday)
 */
public class GradeService extends Service<GradeDAO> {
    public GradeService(GradeDAO dao) {
        super(dao);
    }
}
