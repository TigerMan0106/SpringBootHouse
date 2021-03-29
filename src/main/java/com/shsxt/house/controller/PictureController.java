package com.shsxt.house.controller;

import com.shsxt.house.po.Picture;
import com.shsxt.house.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

@RequestMapping("/picture")
@RestController
public class PictureController {
    @Autowired
    private PictureService pictureService;
    String picturePath="C:\\Users\\HP\\Desktop\\图片\\";
    //String picturePath="http://localhost:8089/images/";
    String picturePattern="";
    @GetMapping("queryPicture")
    public Picture queryPictureByHouseId(Integer houseId){
        return pictureService.queryPictureByHouseId(houseId);
    }
    @PostMapping("insertPicture")
    public int insertPicture(Picture picture){
        return pictureService.insertPicture(picture);
    }
    @PostMapping("addPicture")
    public Object addPicture(HttpServletRequest request){
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("picture");
        List<Picture> pictures = new LinkedList<>();
        Picture picture = new Picture();
        try {
            /*if (files.size() ==0) {
                msg.setMeta("请求不正确，没有上传文件。",701);
                return msg;
            }
            for (MultipartFile multipartFile : files){
                if(multipartFile.isEmpty()){
                    msg.setMeta("请求不正确，存在空文件。",701);
                    return msg;
                }
            }*/
            for (MultipartFile multipartFile : files){
//                logger.info("是否为空："+multipartFile.isEmpty());
                String oldName = multipartFile.getOriginalFilename();//获取旧的文件名
                System.out.println("oldName"+oldName);
                String suffix = oldName.substring(oldName.lastIndexOf("."));//获取后缀
                System.out.println("suffix"+suffix);
                File localFile = new File(picturePath+ UUID.randomUUID()+suffix);//文件路径
                System.out.println("localFile"+localFile);
                //据说uuid基本不可能重复，但还是做个判断
                if(localFile.exists()){
                    localFile = new File(picturePath+ UUID.randomUUID()+ Calendar.getInstance().getTimeInMillis() +suffix);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(localFile);
                fileOutputStream.write(multipartFile.getBytes());
                fileOutputStream.close();
                picture.setPictureUrl(picturePattern.substring(0,picturePattern.lastIndexOf("/")+1)+localFile);
                picture.setHouseId(Integer.parseInt(request.getParameter("houseId")));
                //System.out.println(Integer.parseInt(request.getParameter("houseId")));
                pictureService.insertPicture(picture);
            }
        return 1;
        } catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }
//    @PutMapping("updatePicture")
//    public int updatePicture(HttpServletRequest request){
//        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("picture");
//        List<Picture> pictures = new LinkedList<>();
//        Picture picture = new Picture();
//        try {
//
//            /*if (files.size() ==0) {
//                msg.setMeta("请求不正确，没有上传文件。",701);
//                return msg;
//            }
//            for (MultipartFile multipartFile : files){
//                if(multipartFile.isEmpty()){
//                    msg.setMeta("请求不正确，存在空文件。",701);
//                    return msg;
//                }
//            }*/
//            for (MultipartFile multipartFile : files){
////                logger.info("是否为空："+multipartFile.isEmpty());
//                String oldName = multipartFile.getOriginalFilename();//获取旧的文件名
//                System.out.println("oldName"+oldName);
//                String suffix = oldName.substring(oldName.lastIndexOf("."));//获取后缀
//                System.out.println("suffix"+suffix);
//                File localFile = new File(picturePath+ UUID.randomUUID()+suffix);//文件路径
//                System.out.println("localFile"+localFile);
//                //据说uuid基本不可能重复，但还是做个判断
//                if(localFile.exists()){
//                    localFile = new File(picturePath+ UUID.randomUUID()+ Calendar.getInstance().getTimeInMillis() +suffix);
//                }
//                FileOutputStream fileOutputStream = new FileOutputStream(localFile);
//                fileOutputStream.write(multipartFile.getBytes());
//                fileOutputStream.close();
//
//                picture.setPictureUrl(picturePattern.substring(0,picturePattern.lastIndexOf("/")+1)+localFile.getName());
//                picture.setHouseId(1);
//                pictureService.insertPicture(picture);
//                //pictures.add(picture);
//            }
//            return 1;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return 1;
//    }
    @DeleteMapping("deletePicture")
    public int deletePictureByHouseId(Integer houseId){
        return pictureService.deletePictureByHouseId(houseId);
    }
}