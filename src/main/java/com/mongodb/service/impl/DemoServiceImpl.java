package com.mongodb.service.impl;

import com.mongodb.dao.IBaseDao;
import com.mongodb.model.UserInfo;
import com.mongodb.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liukx
 * @create 2017-04-27 11:07
 * @email liukx@elab-plus.com
 **/
@Service("demoService")
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private IBaseDao<UserInfo> baseDao;

    public void save(UserInfo userInfo) {
        baseDao.save(userInfo);
    }

    public List findAll() {
        List all = baseDao.findAll();
        return all;
    }
}
