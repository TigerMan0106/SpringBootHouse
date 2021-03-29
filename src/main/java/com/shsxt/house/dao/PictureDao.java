package com.shsxt.house.dao;

import com.shsxt.house.po.Picture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureDao {
    public Picture queryPictureByHouseId(@Param("houseId") Integer houseId);
    public int insertPicture(Picture picture);
    public int deletePictureByHouseId(@Param("houseId") Integer houseId);
    public int updatePicture(Picture picture);
}
