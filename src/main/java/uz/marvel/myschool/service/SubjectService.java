package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.SubjectDAO;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:24 (Wednesday)
 */
public class SubjectService extends Service<SubjectDAO> {
    public SubjectService(SubjectDAO dao) {
        super(dao);
    }
}
