package com.springboot.test.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    private Logger log = LoggerFactory.getLogger(getClass());//生成日志

    @GetMapping("/index/{username}")
    public String index( @PathVariable("username") String username){
        log.info("{}:访问首页",username);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("username",username);
//        Map<String,String> infomap=new HashMap<>();
//        infomap.put("age","23");
//        infomap.put("add","北京通州");
//        modelAndView.addObject(infomap);
        return "index";
    }


}
