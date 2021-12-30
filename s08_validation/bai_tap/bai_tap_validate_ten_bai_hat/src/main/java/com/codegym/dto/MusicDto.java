package com.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MusicDto implements Validator {
    @NotNull(message = "Không được để trống id")
    Integer id;
    @NotNull(message = "Không được để trống id")
    @Size (min =1, max = 800)
    String name;
    @NotNull(message = "Không được để trống id")
    @Size (min =1, max = 300)
    String singer;
    @NotNull(message = "Không được để trống id")
    @Size (min =1, max = 1000)
    String typeOfMusic;

    public MusicDto() {
    }

    public MusicDto(Integer id, String name, String singer, String typeOfMusic) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.typeOfMusic = typeOfMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        MusicDto musicDto = (MusicDto) target;
        if(!musicDto.name.matches("[!@#$%^&*()-+,.=;]")){
            errors.rejectValue("name","name.invalidFormat");
        }
        if(!musicDto.singer.matches("[!@#$%^&*()-+,.=;]")){
            errors.rejectValue("singer","singer.invalidFormat");
        }
        if(!musicDto.typeOfMusic.matches("[!@#$%^&*()-+.=;]")){
            errors.rejectValue("typeOfMusic","typeOfMusic.invalidFormat");
        }
    }
}
