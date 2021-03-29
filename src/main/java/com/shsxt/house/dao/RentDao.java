package com.shsxt.house.dao;

import com.shsxt.house.po.Rent;
import com.shsxt.house.query.RentQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RentDao {
    public Rent queryRentByRentId(@Param("rentId")Integer rentId);
    public int insertRent(Rent rent);
    public int updateRent(Rent rent);
    public int deleteRentByRentId(@Param("rentId")Integer rentId);
    public List<Rent> queryRentList(RentQuery rentQuery);
}
