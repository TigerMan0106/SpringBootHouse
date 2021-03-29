package com.shsxt.house.service;

import com.shsxt.house.dao.PictureDao;
import com.shsxt.house.po.Picture;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PictureService {
    @Resource
    private PictureDao pictureDao;
    public Picture queryPictureByHouseId(Integer houseId){
        return pictureDao.queryPictureByHouseId(houseId);
    }
    //@Transactional(propagation = Propagation.REQUIRED)
    public int insertPicture(Picture picture){
        return pictureDao.insertPicture(picture);
    }
    //@Transactional(propagation = Propagation.REQUIRED)
    public int deletePictureByHouseId(Integer houseId){
        return pictureDao.deletePictureByHouseId(houseId);
    }
    //@Transactional(propagation = Propagation.REQUIRED)
    public int updatePicture(Picture picture){
        return pictureDao.updatePicture(picture);
    }
}
