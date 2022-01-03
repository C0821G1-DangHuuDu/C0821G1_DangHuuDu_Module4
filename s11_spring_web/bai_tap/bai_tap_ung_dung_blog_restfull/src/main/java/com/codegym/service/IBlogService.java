package com.codegym.service;


import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {
    List<Blog> findALL();

    void save(Blog blog);

    void remove(int id);

    Blog findById(Integer id);

    List<Blog> findByName(String name);

    Page<Blog> findAll(Pageable of);
}
