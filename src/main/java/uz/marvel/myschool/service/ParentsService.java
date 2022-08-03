package uz.marvel.myschool.service;

import uz.marvel.myschool.dao.ParentsDAO;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  12:24 (Wednesday)
 */
public class ParentsService extends Service<ParentsDAO> {
    public ParentsService(ParentsDAO dao) {
        super(dao);
    }
}
