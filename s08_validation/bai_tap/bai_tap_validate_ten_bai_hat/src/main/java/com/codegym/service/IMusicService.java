package com.codegym.service;

import com.codegym.dto.MusicDto;
import com.codegym.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IMusicService {
    Page<Music> findAll(PageRequest of);

    void save(MusicDto musicDto);

    Music findById(Integer id);
}
