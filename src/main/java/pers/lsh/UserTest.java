package pers.lsh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/lsh/applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        Demo demo = user.getDemo();
        demo.test();

        user.hello();
        System.out.println(user.toString());
    }
}
