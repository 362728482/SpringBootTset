package com.springboot.test.springboottest.controller;


import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafTest {
    private Logger log = LoggerFactory.getLogger(getClass());//生成日志

    @RequestMapping("/thymeleafTest/index")
    public String thymeleafIndex(){
        log.info("登录thymeleaf首页");
        return "thymeleafindex";
    }

    @RequestMapping("/thymeleafTest/index/{username}")
    public String thymeleafIndex(@PathVariable String username){
        log.info("{}:登录thymeleaf首页",username);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("thymeleafindex");
        mav.addObject("username",username);
        return "thymeleafindex";
    }
}
