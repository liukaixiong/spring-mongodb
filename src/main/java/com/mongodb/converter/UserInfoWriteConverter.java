package com.mongodb.converter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.model.UserInfo;
import org.springframework.core.convert.converter.Converter;

/**
 * 写数据时会被调用的方法
 *
 * @author Liukx
 * @create 2017-04-28 14:40
 * @email liukx@elab-plus.com
 **/
public class UserInfoWriteConverter implements Converter<UserInfo, DBObject> {

    public DBObject convert(UserInfo userInfo) {
        DBObject dbo = new BasicDBObject();
        dbo.put("_id", userInfo.getId());
        dbo.put("name", userInfo.getName());
        dbo.put("myage", userInfo.getAge());
        System.out.println(" 数据写入赋值成功 - ");
        return dbo;
    }
}
