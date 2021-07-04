package com.luca.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luca
 * @Description 10:18
 */
//设置与数据库相对应的注解：@Entity ：使之具备与数据库连接的能力
@Entity
@Table(name="t_tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id ：代表是主键    @GeneratedValue ：代表生成策略（这里是自动生成）

    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
