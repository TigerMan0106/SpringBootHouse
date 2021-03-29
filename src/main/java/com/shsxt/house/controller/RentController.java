package com.shsxt.house.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.po.Rent;
import com.shsxt.house.query.RentQuery;
import com.shsxt.house.service.RentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rent")
public class RentController {
    @Resource
    private RentService rentService;
    @GetMapping("queryRent")
    public Rent queryRent(Integer rentId){
        return rentService.queryRentByRentId(rentId);
    }
    @PostMapping("insertRent")
    public int insertRent(Rent rent){
        return rentService.insertRent(rent);
    }
    @PutMapping("updateRent")
    public int updateRent(Rent rent){
        return rentService.updateRent(rent);
    }
    @DeleteMapping("deleteRent")
    public int deleteRent(Integer rentId){
        return rentService.deleteRentByRentId(rentId);
    }
    @GetMapping("queryRentList")
    public PageInfo<Rent> queryRentList(RentQuery rentQuery){
        return rentService.queryRentList(rentQuery);
    }
}
