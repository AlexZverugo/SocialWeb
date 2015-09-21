package dao.impl;

import dao.common.BaseDAO;
import entity.Post;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 14.09.2015.
 */
@Repository("postDAO")
public class PostDaoImpl extends BaseDAO<Post> {

    @Override
    public Post getData(long id) {
        Post post;
        post = (Post) getSessionFactory().getCurrentSession().load(Post.class, id);
        return post;
    }

    @Override
    public List<Post> getListOfData() {
        List<Post> posts;
        posts = getSessionFactory().getCurrentSession().createCriteria(Post.class).list();
        return posts;
    }
}
