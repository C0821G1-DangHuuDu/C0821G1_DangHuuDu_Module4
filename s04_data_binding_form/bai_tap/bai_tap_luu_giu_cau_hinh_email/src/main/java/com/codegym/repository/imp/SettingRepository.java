package com.codegym.repository.imp;

import com.codegym.model.Setting;
import com.codegym.repository.ISettingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SettingRepository implements ISettingRepository {
    List<Setting> settingList = new ArrayList<>();

    @Override
    public void save(Setting setting) {
    settingList.add(setting);
    }
}
