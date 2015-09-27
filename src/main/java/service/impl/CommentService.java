package service.impl;

import dao.SocialWebDAO;
import entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 27.09.2015.
 */
@Service("commentService")
public class CommentService implements SocialWebService<Comment> {

    @Autowired
    private SocialWebDAO commentDAO;

    @Override
    @Transactional
    public void addData(Comment data) {
        commentDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(Comment data) {
        commentDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(Comment data) {
        commentDAO.updateData(data);
    }

    @Override
    @Transactional
    public Comment getData(long id) {
        return (Comment) commentDAO.getData(id);
    }

    @Override
    @Transactional
    public List<Comment> getListOfData() {
        return commentDAO.getListOfData();
    }
}
