package com.java.service;

import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 14:14
 * description:ClassConsumer
 * author:潘全科
 */
public interface ClassConsumer {
    List<Map<String,Object>> getAllClass();
    Map<String,Object>getOneClass(Long id);
    List<Map<String,Object>>getClassname();
    int InsertClass(Map map);
}
