package com.shsxt.house.dao;

import com.shsxt.house.po.Repair;
import com.shsxt.house.query.RepairQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepairDao {
    public Repair queryRepairByRepairId(@Param("repairId") Integer repairId);
    public int insertRepair(Repair repair);
    public int deleteRepairByRepairId(@Param("repairId") Integer repairId);
    public int updateRepair(Repair repair);
    public List<Repair> queryRepairList(RepairQuery repairQuery);
    int updateStatus(@Param("repairId") Integer repairId,@Param("repairStatus")String repairStatus);
}
