package com.java.api;

import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 13:55
 * description:FagqIt
 * author:潘全科
 */
public interface FagqIt {
   List<Map<String,Object>>getClassList();
   Map<String,Object>getOneClass(Long id);
   List<Map<String,Object>>getClassname();
   int InsertClass(Map map);
}
