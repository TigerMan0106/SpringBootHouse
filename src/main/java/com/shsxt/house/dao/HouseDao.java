package com.shsxt.house.dao;

import com.shsxt.house.po.House;
import com.shsxt.house.query.HouseQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseDao {
    public House queryHouseById(@Param("houseId")Integer houseId);
    public int updateHouse(House house);
    public int insertHouse(House house);
    public int deleteHouseById(@Param("houseId")Integer houseId);
    public List<House> queryHouseList(HouseQuery houseQuery);
    int updateStatus(@Param("houseId")Integer houseId,@Param("houseStatus")String houseStatus);
}
