package com.mongodb.dao;/**
 * Created by liukx on 2017/4/27.
 */

import java.io.Serializable;
import java.util.List;

/**
 * 基础数据访问类
 *
 * @author Liukx
 * @create 2017-04-27 10:51
 * @email liukx@elab-plus.com
 **/
public abstract class IBaseDao<T> {

    public abstract void save(T entity);

    public abstract void update(T entity);

    public abstract void delete(Serializable... ids);

    public abstract T find(Serializable id);

    public abstract List<T> findAll();

    public abstract List<T> findAll(String order);

    public abstract List<T> findByProp(String propName, Object propValue);

    public abstract List<T> findByProp(String propName, Object propValue, String order);

    public abstract List<T> findByProps(String[] propName, Object[] propValue);

    public abstract List<T> findByProps(String[] propName, Object[] propValue, String order);

    public abstract T uniqueByProp(String propName, Object propValue);

    public abstract T uniqueByProps(String[] propName, Object[] propValue);

}
