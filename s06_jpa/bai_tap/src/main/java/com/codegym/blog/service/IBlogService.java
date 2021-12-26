package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBlogService {
    List<Blog> findALL();

    void save(Blog blog);

    void remove(int id);

    Blog findById(Integer id);

    List<Blog> findByName(String name);
}
