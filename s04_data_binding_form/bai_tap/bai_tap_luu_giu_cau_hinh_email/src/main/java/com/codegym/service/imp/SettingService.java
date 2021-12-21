package com.codegym.service.imp;

import com.codegym.model.Setting;
import com.codegym.repository.ISettingRepository;
import com.codegym.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    @Autowired
    private ISettingRepository settingRepository;


    @Override
    public void save(Setting setting) {
        settingRepository.save(setting);
    }
}
