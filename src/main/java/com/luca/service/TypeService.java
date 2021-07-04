package com.luca.service;

import com.luca.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Luca
 * @Description 21:16
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);  //定义拿到数据的大小

    Type updateType(Long id, Type type);

    void deleteType(Long id);

}
