package service.impl;

import entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.common.BaseService;

import java.util.List;

/**
 * Created by Alex on 20.09.2015.
 */
@Service("userService")
public class UserService extends BaseService<User> {
    @Override
    @Transactional
    public User getData(long id) {
        return (User) getSocialWebDAO().getData(id);
    }

    @Override
    @Transactional
    public List<User> getListOfData() {
        return getSocialWebDAO().getListOfData();
    }
}
