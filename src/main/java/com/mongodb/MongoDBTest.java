package com.mongodb;

import com.mongodb.dao.impl.UserDaoImpl;
import com.mongodb.model.WyyComment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author Liukx
 * @create 2017-04-27 13:30
 * @email liukx@elab-plus.com
 **/
public class MongoDBTest {
    public static void main(String[] args) {
        String xml[] = new String[]{"classpath:spring/applicationContext-service.xml", "classpath:spring/applicationContext-mongo.xml"};
        ApplicationContext app = new ClassPathXmlApplicationContext(xml);
        UserDaoImpl demoService = (UserDaoImpl) app.getBean("userDao");

//        demoService.findTextIndex();
//        UserInfo userInfo = new UserInfo();
//        userInfo.setAge(22);
//        userInfo.setName("抱歉");
//        userInfo.setBirth(new Date());
//        demoService.save(userInfo);
//        List all = demoService.findAll();
//        System.out.println(all.toString());
//        demoService.selectText();
//        demoService.batchInsert();


        WyyComment wyyComment = new WyyComment();
        wyyComment.setComment_id(1);
        wyyComment.setComment_time(new Date());
        wyyComment.setLike_count(1000);
        wyyComment.setLiked("111");
        wyyComment.setContent("听妈妈的话..");
        wyyComment.setUser_id(111);
        demoService.save(wyyComment);
    }
}
