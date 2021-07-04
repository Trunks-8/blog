package com.luca.service;

import com.luca.po.Blog;
import com.luca.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author Luca
 * @Description 23:58
 *
 * finished
 */
public interface BlogService {

    Blog getBlog(Long id);

    //编辑器转换为html
    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Long pageable, Pageable blog);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(java.awt.print.Pageable tagId, BlogQuery pageable);

    //首页查询方法
//    Page<Blog> listBlog(Long query, Pageable pageable);

    //首页查询方法
    Page<Blog> listBlog(String query, Pageable pageable);

    //首页展示
    List<Blog> listRecommendBlogTop(Integer size);

    Map<String, List<Blog>> archiveBlog();

    Long countBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

}
