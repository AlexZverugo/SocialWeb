package dao.impl;

import dao.common.BaseDAO;
import entity.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 14.09.2015.
 */

@Repository("userDAO")
public class UserDAOImpl extends BaseDAO<User> {

    @Override
    public User getData(long id) {
        User user;
        user = (User) getSessionFactory().getCurrentSession().load(User.class, id);
        return user;
    }

    @Override
    public List<User> getListOfData() {
        List<User> users;
        users = getSessionFactory().getCurrentSession().createCriteria(User.class).list();
        return users;
    }
}
