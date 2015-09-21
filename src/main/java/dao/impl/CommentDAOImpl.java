package dao.impl;

import dao.common.BaseDAO;
import entity.Comment;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 15.09.2015.
 */
@Repository("commentDAO")
public class CommentDAOImpl extends BaseDAO<Comment> {

    @Override
    public Comment getData(long id)  {
        Comment comment;
        comment = (Comment) getSessionFactory().getCurrentSession().load(Comment.class, id);
        return comment;
    }

    @Override
    public List<Comment> getListOfData() {
        List<Comment> comments;
        comments = getSessionFactory().getCurrentSession().createCriteria(Comment.class).list();
        return comments;
    }
}
