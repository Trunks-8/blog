package com.luca.po;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Luca
 * @Description 10:21
 */
//设置与数据库相对应的注解：@Entity ：使之具备与数据库连接的能力
@SuppressWarnings("ALL")
@Entity
@Table(name = "t_comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id ：代表是主键    @GeneratedValue ：代表生成策略（这里是自动生成）
    private Long id;
    private String nickname;  //昵称
    private String email;  //电子邮箱
    private String content;  //内容
    private String avatar;  //头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;  //创建时间

    @ManyToOne
    private Blog blog;

    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>();  //子对象

    @ManyToOne
    private Comment parentComment;  //父对象

    private boolean adminComment;

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}
