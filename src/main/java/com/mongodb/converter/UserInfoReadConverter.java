package com.mongodb.converter;

import com.mongodb.DBObject;
import com.mongodb.model.UserInfo;
import org.springframework.core.convert.converter.Converter;

/**
 * 读取数据时 , 将DBObject转换成userinfo
 * 1. 适用场景
 * ★ 大数据量的情况下,可能反射会特别耗时,这时候采用手动赋值的方式可以加快获取对象的时间
 *
 * @Description:
 * @Author: Liukx on 2017/4/28 - 14:37
 */
public class UserInfoReadConverter implements Converter<DBObject, UserInfo> {

    public UserInfo convert(DBObject source) {
        UserInfo p = new UserInfo();
        p.setId(source.get("_id").toString());
        p.setAge((Integer) source.get("myage"));
        p.setName(source.get("name").toString());
        System.out.println("数据读取转换成功~");
        return p;
    }

}