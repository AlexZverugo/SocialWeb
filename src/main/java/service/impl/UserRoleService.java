package service.impl;

import dao.SocialWebDAO;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 27.09.2015.
 */
@Service("userRoleService")
public class UserRoleService implements SocialWebService<UserRole> {

    @Autowired
    private SocialWebDAO userRoleDAO;

    @Override
    @Transactional
    public void addData(UserRole data) {
        userRoleDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(UserRole data) {
        userRoleDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(UserRole data) {
        userRoleDAO.updateData(data);
    }

    @Override
    @Transactional
    public UserRole getData(long id) {
        return (UserRole) userRoleDAO.getData(id);
    }

    @Override
    @Transactional
    public List<UserRole> getListOfData() {
        return userRoleDAO.getListOfData();
    }
}
