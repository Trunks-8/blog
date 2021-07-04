package com.luca.service;

import com.luca.po.Comment;

import java.util.List;

/**
 * @author Luca
 * @Description 15:42
 */
@SuppressWarnings("UnusedReturnValue")
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);

}
