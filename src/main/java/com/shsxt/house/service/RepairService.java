package com.shsxt.house.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.RepairDao;
import com.shsxt.house.po.Repair;
import com.shsxt.house.query.RepairQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RepairService {
    @Resource
    private RepairDao repairDao;
    public Repair queryRepairByRepairId(Integer repairId){
        return repairDao.queryRepairByRepairId(repairId);
    }
    public int insertRepair(Repair repair){
        return repairDao.insertRepair(repair);
    }
    public int deleteRepairByRepairId(Integer repairId){
        return repairDao.deleteRepairByRepairId(repairId);
    }
    public int updateRepair(Repair repair){
        return repairDao.updateRepair(repair);
    }
    public PageInfo<Repair> queryRepairList(RepairQuery repairQuery){
        PageHelper.startPage(repairQuery.getPageNum(),repairQuery.getPageSize());
        return new  PageInfo<Repair>(repairDao.queryRepairList(repairQuery));
    }
}
