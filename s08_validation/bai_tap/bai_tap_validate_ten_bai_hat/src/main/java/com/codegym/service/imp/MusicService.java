package com.codegym.service.imp;

import com.codegym.dto.MusicDto;
import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;

    @Override
    public Page<Music> findAll(PageRequest of) {
        return musicRepository.findAll(of);
    }

    @Override
    public void save(MusicDto musicDto) {
        Music music =new Music(musicDto.getId(),musicDto.getName(),musicDto.getSinger(),musicDto.getTypeOfMusic());
        musicRepository.save(music);
    }

    @Override
    public Music findById(Integer id) {
        return musicRepository.getById(id);
    }

}
