package com.shsxt.house.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.RentDao;
import com.shsxt.house.po.Rent;
import com.shsxt.house.query.RentQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RentService {
    @Resource
    private RentDao rentDao;
    public Rent queryRentByRentId(Integer rentId){
        return rentDao.queryRentByRentId(rentId);
    }
    public int insertRent(Rent rent){
        return rentDao.insertRent(rent);
    }
    public int updateRent(Rent rent){
        return rentDao.updateRent(rent);
    }
    public int deleteRentByRentId(Integer rentId){
        return rentDao.deleteRentByRentId(rentId);
    }
    public PageInfo<Rent> queryRentList(RentQuery rentQuery){
        PageHelper.startPage(rentQuery.getPageNum(),rentQuery.getPageSize());
        return new PageInfo<Rent>(rentDao.queryRentList(rentQuery));
    }
}
