package com.tiny.usercenter.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/10/9 15:14
 */
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file){
        return saveFile(file);
    }

    private Object saveFile(MultipartFile file){
        if (file.isEmpty()){
            return "未选择文件";
        }
        //获取上传文件原来的名称
        String filename = file.getOriginalFilename();
        String filePath = "c:/upload/users/temp/";
        File temp = new File(filePath);
        if (!temp.exists()){
            temp.mkdirs();
        }

        File localFile = new File(filePath+filename);
        try {
            //把上传的文件保存至本地
            file.transferTo(localFile);
            System.out.println(file.getOriginalFilename()+" 上传成功");
        }catch (IOException e){
            e.printStackTrace();
            return "上传失败";
        }

        return "ok";
    }

}
