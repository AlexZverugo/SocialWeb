package service.impl;

import dao.SocialWebDAO;
import entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 27.09.2015.
 */
@Service("postService")
public class PostService implements SocialWebService<Post> {

    @Autowired
    private SocialWebDAO postDAO;

    @Override
    @Transactional
    public void addData(Post data) {
        postDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(Post data) {
        postDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(Post data) {
        postDAO.updateData(data);
    }

    @Override
    @Transactional
    public Post getData(long id) {
        return (Post) postDAO.getData(id);
    }

    @Override
    @Transactional
    public List<Post> getListOfData() {
        return postDAO.getListOfData();
    }
}
