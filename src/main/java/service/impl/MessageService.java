package service.impl;

import entity.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.common.BaseService;

import java.util.List;

/**
 * Created by Alex on 20.09.2015.
 */

@Service("messageService")
public class MessageService extends BaseService<Message> {
    @Override
    @Transactional
    public Message getData(long id) {
        return (Message) getSocialWebDAO().getData(id);
    }

    @Override
    @Transactional
    public List<Message> getListOfData() {
        return getSocialWebDAO().getListOfData();
    }
}
