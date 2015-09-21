package dao.impl;

import dao.common.BaseDAO;
import entity.UserRole;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 14.09.2015.
 */
public class UserRoleDAOImpl extends BaseDAO<UserRole> {

    @Override
    public UserRole getData(long id) {
        UserRole userRole;
        userRole = (UserRole) getSessionFactory().getCurrentSession().load(UserRole.class, id);
        return userRole;
    }

    @Override
    public List<UserRole> getListOfData() {
        List<UserRole> userRoles;
        userRoles = getSessionFactory().getCurrentSession().createCriteria(UserRole.class).list();
        return userRoles;
    }
}
