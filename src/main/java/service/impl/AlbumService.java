package service.impl;

import dao.SocialWebDAO;
import entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 27.09.2015.
 */
@Service("albumService")
public class AlbumService implements SocialWebService<Album> {

    @Autowired
    private SocialWebDAO albumDAO;

    @Override
    @Transactional
    public void addData(Album data) {
        albumDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(Album data) {
        albumDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(Album data) {
        albumDAO.updateData(data);
    }

    @Override
    @Transactional
    public Album getData(long id) {
        return (Album) albumDAO.getData(id);
    }

    @Override
    @Transactional
    public List<Album> getListOfData() {
        return albumDAO.getListOfData();
    }
}
