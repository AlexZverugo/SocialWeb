package general;

import dao.impl.UserDAOImpl;
import entity.User;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.common.BaseService;
import service.impl.UserService;

/**
 * Created by Alex on 20.09.2015.
 */
public class Example {
    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");



        User user = new User();


        user.setLogin("helloooo");
        user.setName("q12222");
        user.setSurname("ssd78");
        user.setEmail("qwerty_al@mail.ru");
        user.setActive(true);
        user.setPassword("1ssd4556");

        BaseService service = (UserService) context.getBean("userService");
        service.setSocialWebDAO(new UserDAOImpl());

        service.addData(user);

        context.close();
    }
}
