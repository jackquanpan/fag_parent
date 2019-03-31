package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;

import com.java.api.FagqIt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 14:07
 * description:ClassConsumerImpl
 * author:潘全科
 */
@Service
public class ClassConsumerImpl implements com.java.service.ClassConsumer {
    @Reference(version = "1.0.0")
    private FagqIt fagqIt;
    @Override
    public List<Map<String,Object>>getAllClass(){
        return fagqIt.getClassList();
    }

    @Override
    public Map<String, Object> getOneClass(Long id) {
        return fagqIt.getOneClass(id);
    }

    @Override
    public List<Map<String, Object>> getClassname() {
        return fagqIt.getClassname();
    }

    @Override
    public int InsertClass(Map map) {
        return fagqIt.InsertClass(map);
    }

}
