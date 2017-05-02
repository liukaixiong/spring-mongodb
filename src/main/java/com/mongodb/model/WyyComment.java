package com.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论表
 */
@Document(collection = "wyyComment")
public class WyyComment implements Serializable {

    private static final long serialVersionUID = 1L;
    //
    // 表字段 : wyy_comment.id
    @Id
    private String id;

    // 歌曲编号
    // 表字段 : wyy_comment.music_id
    @Field
    private Integer music_id;

    // 歌曲链接
    // 表字段 : wyy_comment.music_url
    @Field
    private String music_url;

    //
    // 表字段 : wyy_comment.comment_id
    @Field
    private Integer comment_id;

    // 用户编号
    // 表字段 : wyy_comment.user_id
    @Field
    private Integer user_id;

    // 点赞总数
    // 表字段 : wyy_comment.like_count
    @Field
    private Integer like_count;

    // 内容
    // 表字段 : wyy_comment.content
    @TextIndexed
    @Field
    private String content;

    // 评论时间
    // 表字段 : wyy_comment.comment_time
    @Field
    private Date comment_time;

    //
    // 表字段 : wyy_comment.liked
    @Field
    private String liked;

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 描述 ： 歌曲编号
     * 对应数据库： ->  wyy_comment.music_id
     *
     * @mbg.generated
     */
    public Integer getMusic_id() {
        return music_id;
    }

    /**
     * 描述 ： 歌曲编号
     * 对应数据库： ->  wyy_comment.music_id
     *
     * @mbg.generated
     */
    public void setMusic_id(Integer music_id) {
        this.music_id = music_id;
    }

    /**
     * 描述 ： 歌曲链接
     * 对应数据库： ->  wyy_comment.music_url
     *
     * @mbg.generated
     */
    public String getMusic_url() {
        return music_url;
    }

    /**
     * 描述 ： 歌曲链接
     * 对应数据库： ->  wyy_comment.music_url
     *
     * @mbg.generated
     */
    public void setMusic_url(String music_url) {
        this.music_url = music_url == null ? null : music_url.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.comment_id
     *
     * @mbg.generated
     */
    public Integer getComment_id() {
        return comment_id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.comment_id
     *
     * @mbg.generated
     */
    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    /**
     * 描述 ： 用户编号
     * 对应数据库： ->  wyy_comment.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 描述 ： 用户编号
     * 对应数据库： ->  wyy_comment.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 描述 ： 点赞总数
     * 对应数据库： ->  wyy_comment.like_count
     *
     * @mbg.generated
     */
    public Integer getLike_count() {
        return like_count;
    }

    /**
     * 描述 ： 点赞总数
     * 对应数据库： ->  wyy_comment.like_count
     *
     * @mbg.generated
     */
    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    /**
     * 描述 ： 内容
     * 对应数据库： ->  wyy_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * 描述 ： 内容
     * 对应数据库： ->  wyy_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 描述 ： 评论时间
     * 对应数据库： ->  wyy_comment.comment_time
     *
     * @mbg.generated
     */
    public Date getComment_time() {
        return comment_time;
    }

    /**
     * 描述 ： 评论时间
     * 对应数据库： ->  wyy_comment.comment_time
     *
     * @mbg.generated
     */
    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.liked
     *
     * @mbg.generated
     */
    public String getLiked() {
        return liked;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  wyy_comment.liked
     *
     * @mbg.generated
     */
    public void setLiked(String liked) {
        this.liked = liked == null ? null : liked.trim();
    }
}