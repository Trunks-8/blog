package com.luca.po;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Luca
 * @Description 13:23
 */
//设置与数据库相对应的注解：@Entity ：使之具备与数据库连接的能力
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "t_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id ：代表是主键    @GeneratedValue ：代表生成策略（这里是自动生成）
    private Long id;
    private String nickname;  //昵称
    private String username;  //用户名
    private String password;  //密码
    private String email;  //电子邮箱
    private String avatar;  //头像
    private Integer type;  //类型
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;  //创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;  //更新时间

    @OneToMany(mappedBy="user")
    private List<Blog> blogs = new ArrayList<>();

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

}
