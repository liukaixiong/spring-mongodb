package com.mongodb.dao.impl;

import com.mongodb.model.UserInfo;
import com.mongodb.model.WyyComment;
import org.springframework.data.mongodb.core.index.TextIndexDefinition;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liukx
 * @create 2017-04-27 14:38
 * @email liukx@elab-plus.com
 **/
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl {

    public Class<UserInfo> getEntityClass() {
        return UserInfo.class;
    }

    public void selectText() {
    }

    /**
     * 根据正则查询字段
     *
     * @param filed
     * @param regex
     * @return
     */
    public List<WyyComment> queryByRegex(String filed, String regex) {
        Query query = new Query();
        query.addCriteria(Criteria.where(filed).regex(regex));
        List<WyyComment> page = mgt.find(query, WyyComment.class);
        return page;
    }

    public void findTextIndex() {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("content").regex("此"));
//        List<WyyComment> page = mgt.find(query, WyyComment.class);
//        List<WyyComment> all = mgt.findAll(WyyComment.class);
//        System.out.println("page=" + page);
        TextIndexDefinition textIndex = new TextIndexDefinition.TextIndexDefinitionBuilder()
                .onField("title", 2F)
                .onField("content")
                .build();
        mgt.indexOps(WyyComment.class).ensureIndex(textIndex);
    }
}
//