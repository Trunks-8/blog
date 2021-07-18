package com.luca.po;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luca
 * @Description 10:15
 */
//设置与数据库相对应的注解：@Entity ：使之具备与数据库连接的能力
@SuppressWarnings("ALL")
@Entity
@Table(name = "t_type")
@Data
public class Type {

    //@Id ：代表是主键    @GeneratedValue ：代表生成策略（这里是自动生成）
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank(message = "分类名称不能为空")
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();

    public Type() {
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
