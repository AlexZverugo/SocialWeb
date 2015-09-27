package service.impl;

import dao.SocialWebDAO;
import entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 27.09.2015.
 */

@Service("profileService")
public class ProfileService implements SocialWebService<Profile>{

    @Autowired
    private SocialWebDAO profileDAO;

    @Override
    @Transactional
    public void addData(Profile data) {
        profileDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(Profile data) {
        profileDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(Profile data) {
        profileDAO.updateData(data);
    }

    @Override
    @Transactional
    public Profile getData(long id) {
        return (Profile) profileDAO.getData(id);
    }

    @Override
    @Transactional
    public List<Profile> getListOfData() {
        return profileDAO.getListOfData();
    }
}
