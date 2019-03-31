package com.java.controller;

import com.java.service.impl.ClassConsumerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * date:2019-02-24
 * 14:13
 * description:ClassShowController
 * author:潘全科
 */
@Controller
public class ClassShowController {
   @Autowired
    private ClassConsumerImpl classsevice;
   @RequestMapping("/findclss.do")
    public @ResponseBody
    List<Map<String,Object>>getAllClass(){
       return classsevice.getAllClass();
   }
   @RequestMapping("/findoneclass.do")
    public @ResponseBody Map<String,Object>getOnclass(Long id){
       return classsevice.getOneClass(id);
   }
   @RequestMapping("/findAllclassname.do")
    public @ResponseBody List<Map<String,Object>>getAllclass(){
       return classsevice.getAllClass();
   }
   @RequestMapping("/insert.do")
    public @ResponseBody boolean insertclass(String title,Long cid,String content){
       Map<String,Object>map=new HashMap<String, Object>();
       map.put("title",title);
       map.put("cid",cid);
       map.put("content",content);
       return classsevice.InsertClass(map)>0;
   }
}
