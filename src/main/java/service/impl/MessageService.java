package service.impl;

import dao.SocialWebDAO;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.SocialWebService;

import java.util.List;

/**
 * Created by Alex on 20.09.2015.
 */

@Service("messageService")
public class MessageService implements SocialWebService<Message> {

    @Autowired
    private SocialWebDAO messageDAO;

    @Override
    @Transactional
    public void addData(Message data) {
        messageDAO.addData(data);
    }

    @Override
    @Transactional
    public void deleteData(Message data) {
        messageDAO.deleteData(data);
    }

    @Override
    @Transactional
    public void updateData(Message data) {
        messageDAO.updateData(data);
    }

    @Override
    @Transactional
    public Message getData(long id) {
        return (Message) messageDAO.getData(id);
    }

    @Override
    @Transactional
    public List<Message> getListOfData() {
        return messageDAO.getListOfData();
    }
}
