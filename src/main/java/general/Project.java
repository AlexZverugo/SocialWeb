package general;

import dao.SocialWebDAO;
import dao.impl.UserDAOImpl;
import entity.Message;
import entity.User;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.common.BaseService;
import service.impl.UserService;

import java.sql.SQLException;
import java.sql.Date;

/**
 * Created by Alex on 14.09.2015.
 */
public class Project {
    public static void main(String[] args) throws SQLException {

        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");



        User user = (User) context.getBean("userService");

//        Factory factory = Factory.getInstance();

//        List<Post> posts = user.getPostList();
//
//        for(Post post : posts) {
//            System.out.println(post.getPostContent());
//        }

//        Post post = new Post();

//        UserRole userRole = userRoleDAO.getUserRole(1);
//        user.getUserRoles().add(userRole);
//        userRole.getUserList().add(user);
        user.setLogin("helloooo");
        user.setName("q12222");
        user.setSurname("ssd78");
        user.setEmail("qwerty_al@mail.ru");
        user.setActive(true);
        user.setPassword("1ssd4556");

        BaseService service = new UserService();
        service.setSocialWebDAO(new UserDAOImpl());

        service.addData(user);

        context.close();
//        userDAO.addUser(user);
//        messageDAO.addMessage(message);

//        try {
//            userDAO.addUser(user);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        post.setLike(3);
//        post.setText("Coooool");
//        post.setUser(user);

//        postDAO.addPost(post);
    }
}
