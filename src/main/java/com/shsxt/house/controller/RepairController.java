package com.shsxt.house.controller;

import com.github.pagehelper.PageInfo;
import com.shsxt.house.po.Repair;
import com.shsxt.house.query.RepairQuery;
import com.shsxt.house.service.RepairService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/repair")
public class RepairController {
    @Resource
    private RepairService repairService;
    @GetMapping("queryRepair")
    public Repair queryRepair(Integer repairId){
        return repairService.queryRepairByRepairId(repairId);
    }
    @PostMapping("insertRepair")
    public int insertRepair(@RequestBody Repair repair){
        return repairService.insertRepair(repair);
    }
    @PutMapping("updateRepair")
    public int updateRepair(Repair repair){
        return repairService.updateRepair(repair);
    }
    @DeleteMapping("deleteRepair")
    public int deleteRepair(Integer repairId){
        return repairService.deleteRepairByRepairId(repairId);
    }
    @GetMapping("queryRepairList")
    public PageInfo<Repair> queryRepairList(RepairQuery repairQuery){
        return repairService.queryRepairList(repairQuery);
    }
    @PutMapping("updateStatus")
    public int updateRepair(Integer repairId,String repairStatus){
        return repairService.updateStatus(repairId,repairStatus);
    }
}
