package dao.impl;

import dao.common.BaseDAO;
import entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alex on 15.09.2015.
 */
@Repository("messageDAO")
public class MessageDAOImpl extends BaseDAO<Message> {

    @Override
    public Message getData(long id) {
        Message message;
        message = (Message) getSessionFactory().getCurrentSession().load(Message.class, id);
        return message;
    }

    @Override
    public List<Message> getListOfData() {
        List<Message> messages;
        messages = getSessionFactory().getCurrentSession().createCriteria(Message.class).list();
        return messages;
    }
}
