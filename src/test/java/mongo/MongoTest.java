package mongo;

import com.mongodb.model.UserInfo;
import com.mongodb.service.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liukx
 * @create 2017-04-27 11:26
 * @email liukx@elab-plus.com
 **/
public class MongoTest {

    public static void main(String[] args) {
        String xml[] = new String[]{"classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-jdbc.xml"};
        ApplicationContext app = new ClassPathXmlApplicationContext(xml);
        IDemoService demoService = (IDemoService) app.getBean("demoService");
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(11);
        userInfo.setName("test");
        demoService.save(userInfo);
    }
}
