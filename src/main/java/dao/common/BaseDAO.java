package dao.common;

import dao.SocialWebDAO;
import entity.common.SocialWebEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Created by Alex on 19.09.2015.
 */
@Repository
public abstract class BaseDAO<T extends SocialWebEntity> implements SocialWebDAO<T> {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addData(T data){
        sessionFactory.getCurrentSession().save(data);
    }

    @Override
    public void deleteData(T data) {
        sessionFactory.getCurrentSession().delete(data);
    }

    @Override
    public void updateData(T data)  {
        sessionFactory.getCurrentSession().update(data);
    }

}
