package dao.impl;

import dao.common.BaseDAO;
import entity.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alex on 15.09.2015.
 */

@Repository("profileDAO")
public class ProfileDAOImpl extends BaseDAO<Profile> {

    @Override
    public Profile getData(long id) {
        Profile profile = (Profile) getSessionFactory().getCurrentSession().load(Profile.class, id);
        return profile;
    }

    @Override
    public List<Profile> getListOfData() {
        List<Profile> profiles;
        profiles = getSessionFactory().getCurrentSession().createCriteria(Profile.class).list();
        return profiles;
    }
}
