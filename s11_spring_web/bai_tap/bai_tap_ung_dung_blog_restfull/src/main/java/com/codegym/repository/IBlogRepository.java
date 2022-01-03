package com.codegym.repository;


import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {

    @Query (value = "select * from blog where name like :name",nativeQuery = true)
    List<Blog> findByName(@Param("name") String name);
}