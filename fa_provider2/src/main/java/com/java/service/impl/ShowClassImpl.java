package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.api.FagqIt;
import com.java.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 14:04
 * description:ShowClassImpl
 * author:潘全科
 */
@Service(version = "1.0.0")
public class ShowClassImpl implements FagqIt {
   @Autowired
   private ClassMapper classMapper;
    @Override
    public List<Map<String, Object>> getClassList() {
        return classMapper.getAllClass();
    }

    @Override
    public Map<String, Object> getOneClass(Long id) {
        return classMapper.getOneclass(id);
    }

    @Override
    public List<Map<String, Object>> getClassname() {
        return classMapper.getAllClasssName();
    }

    @Override
    public int InsertClass(Map map) {
        return classMapper.insertClass(map);
    }
}
