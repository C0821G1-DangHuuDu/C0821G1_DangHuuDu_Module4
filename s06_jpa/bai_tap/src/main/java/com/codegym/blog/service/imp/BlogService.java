package com.codegym.blog.service.imp;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import com.codegym.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findALL() {
        List<Blog> blogList = iBlogRepository.findAll();
        return blogList;
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < findALL().size(); i++) {
            if (findALL().get(i).getId() == id) {
                iBlogRepository.delete(findALL().get(i));
                break;
            }
        }
    }

    @Override
    public Blog findById(Integer id) {
        Blog blog;
        for (int i = 0; i < findALL().size(); i++) {
            if (findALL().get(i).getId() == id) {
                blog = findALL().get(i);
                return blog;
            }
        }
        return null;
    }

    @Override
    public List<Blog> findByName(String name) {
        List<Blog> blogList = iBlogRepository.findByName("%"+name+"%");

        return blogList;
    }
}
