package service.impl;

import dao.SocialWebDAO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 20.09.2015.
 */
@Service("userService")
public class UserService implements SocialWebService<User>{

    @Autowired
    private SocialWebDAO userDAO;


    @Override
    @Transactional
    public void addData(User data) {
        userDAO.addData(data);

    }

    @Override
    @Transactional
    public void deleteData(User data) {
        userDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(User data) {
        userDAO.updateData(data);
    }

    @Override
    @Transactional
    public User getData(long id) {
        return (User) userDAO.getData(id);
    }

    @Override
    @Transactional
    public List<User> getListOfData() {
        return userDAO.getListOfData();
    }
}
