package com.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
/***************************************************/
/*                 附录：
    @Id - 用于字段级别，标记这个字段是一个主键，默认生成的名称是“_id”
    @Document - 用于类，以表示这个类需要映射到数据库，您也可以指定映射到数据库的集合名称
    @DBRef - 用于字段，以表示它将使用com.mongodb.DBRef进行存储。
    @Indexed - 用于字段，表示该字段需要如何创建索引
    @CompoundIndex - 用于类，以声明复合索引
    @GeoSpatialIndexed - 用于字段，进行地理位置索引
    @TextIndexed - 用于字段，标记该字段要包含在文本索引中
    @Language - 用于字段，以设置文本索引的语言覆盖属性。
    @Transient - 默认情况下，所有私有字段都映射到文档，此注解将会去除此字段的映射
    @PersistenceConstructor - 标记一个给定的构造函数，即使是一个protected修饰的，在从数据库实例化对象时使用。构造函数参数通过名称映射到检索的DBObject中的键值。
    @Value - 这个注解是Spring框架的一部分。在映射框架内，它可以应用于构造函数参数。这允许您使用Spring表达式语言语句来转换在数据库中检索的键值，然后再用它来构造一个域对象。为了引用给定文档的属性，必须使用以下表达式：@Value("#root.myProperty")，root要指向给定文档的根。
    @Field - 用于字段，并描述字段的名称，因为它将在MongoDB BSON文档中表示，允许名称与该类的字段名不同。
    @Version - 用于字段锁定，保存操作时检查修改。初始值是0，每次更新时自动触发。                                */
/***************************************************/

/**
 * 用户实体类
 * <p>
 * ClassName: UserInfo
 * </p>
 * <p>
 * Description:本类用来展示MongoDB实体类映射的使用
 * </p>
 * <p>
 * Copyright: (c)2017 Jastar·Wang,All rights reserved.
 * </p>
 *
 * @author Jastar·Wang
 * @date 2017年4月12日
 */
@Document(collection = "coll_user")
public class UserInfo implements Serializable {
    //extends BasicDBObject
//    public Object put(String key, Object val) {
//        return super.put(key, val);
//    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    // 主键使用此注解
    @Id
    private String id;

    // 字段使用此注解
    @Field
    private String name;

    // 字段还可以用自定义名称
    @Field("myage")
    private int age;

    // 还可以生成索引
    @Indexed(name = "index_birth", direction = IndexDirection.DESCENDING)
    @Field
    private Date birth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

}