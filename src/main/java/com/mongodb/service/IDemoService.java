package com.mongodb.service;

import com.mongodb.model.UserInfo;

import java.util.List;

/**
 * 案例接口
 *
 * @author Liukx
 * @create 2017-04-27 11:04
 * @email liukx@elab-plus.com
 **/
public interface IDemoService {

    public void save(UserInfo userInfo);

    public List findAll();

}
