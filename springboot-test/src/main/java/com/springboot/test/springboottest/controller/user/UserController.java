package com.springboot.test.springboottest.controller.user;


import com.springboot.test.springboottest.entity.User;
import com.springboot.test.springboottest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class UserController {

    @Resource(name = "UserService1")
    private UserService userService;

    // 首页
    @GetMapping("/user/indexTest")
    public String index(){
        return "userIndex";
    }

    // 保存
    @PostMapping("/save")
    public String save(User user, MultipartHttpServletRequest request)throws Exception{
        String url = null;
        //上传图片
        MultipartFile multipartFile = request.getFile("imageFile");
        if (null != multipartFile && multipartFile.getSize() > 0) {
            String originalFilename = multipartFile.getOriginalFilename();

            File tmpFile = new File(buildImgPath(request) + "/" + UUID.randomUUID() + originalFilename
                    .substring(originalFilename.lastIndexOf("."), originalFilename.length()));

            if (!multipartFile.isEmpty()) {
                byte[] bytes = multipartFile.getBytes();

                BufferedOutputStream stream = new BufferedOutputStream( new FileOutputStream(tmpFile) );
                stream.write(bytes);
                stream.close();
            }
            tmpFile.delete();
        }

        return "redirect:/user_detail/" + userService.save(user);
    }

    // 获取用户信息
    @GetMapping("/user_detail/{id}")
    public ModelAndView detail(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("user_detail");
        modelAndView.addObject("user",userService.getUserById(id));
        return modelAndView;
    }


    private String buildImgPath(HttpServletRequest request) {
        String path = "upload";
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
        path += "/" + formater.format(new Date());
        path = request.getServletContext().getRealPath(path);
        File dir = new File(path);
        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (Exception e) {

            }
        }
        return path;
    }

}
