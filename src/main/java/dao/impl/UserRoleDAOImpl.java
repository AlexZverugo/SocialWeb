package dao.impl;

import dao.common.BaseDAO;
import entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alex on 14.09.2015.
 */
@Repository("userRoleDAO")
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
