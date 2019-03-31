package com.java.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 13:57
 * description:ClassMapper
 * author:潘全科
 */
public interface ClassMapper {
    @Select("select fa.*,cname from faqs fa inner join classes cl on fa.classId=cl.id")
    List<Map<String,Object>>getAllClass();

    @Select("select fa.*,cname from faqs fa inner join classes cl on fa.classId=cl.id where fa.id=#{arg0}")
    Map<String,Object>getOneclass(Long id);
    @Select("select * from classes")
    List<Map<String,Object>>getAllClasssName();

    @Insert("insert into faqs (title,createDate,content,classId) values(#{title},NOW(),#{content},#{cid})")
    int insertClass(Map map
    );
}
