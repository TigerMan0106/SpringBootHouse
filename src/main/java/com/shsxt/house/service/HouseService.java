package com.shsxt.house.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.HouseDao;
import com.shsxt.house.po.House;
import com.shsxt.house.query.HouseQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseService {
    @Resource
    private HouseDao houseDao;
    public House queryHouseById(Integer houseId){
        return houseDao.queryHouseById(houseId);
    }
    public int updateHouse(House house){
        return houseDao.updateHouse(house);
    }
    public int insertHouse(House house){
        return houseDao.insertHouse(house);
    }
    public int deleteHouseById(Integer houseId){
        return houseDao.deleteHouseById(houseId);
    }
    public PageInfo<House> queryHouseList(HouseQuery houseQuery){
        PageHelper.startPage(houseQuery.getPageNum(),houseQuery.getPageSize());
        return new PageInfo<House>(houseDao.queryHouseList(houseQuery));
    }
}
