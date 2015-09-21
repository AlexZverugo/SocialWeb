package dao.impl;

import dao.common.BaseDAO;
import entity.Album;
import org.springframework.stereotype.Repository;


import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 15.09.2015.
 */

@Repository("albumDAO")
public class AlbumDAOImpl extends BaseDAO<Album> {
    @Override
    public Album getData(long id) {
        Album album;
        album = (Album) getSessionFactory().getCurrentSession().load(Album.class, id);
        return album;
    }

    @Override
    public List<Album> getListOfData() {
        List<Album> albums;
        albums = getSessionFactory().getCurrentSession().createCriteria(Album.class).list();
        return albums;
    }
}
