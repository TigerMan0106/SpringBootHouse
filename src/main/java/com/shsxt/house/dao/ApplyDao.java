package com.shsxt.house.dao;

import com.shsxt.house.po.Apply;
import com.shsxt.house.query.ApplyQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyDao {
    public Apply queryApplyById(@Param("applyId") Integer applyId);
    public int insertApply(Apply apply);
    public int updateApply(Apply apply);
    public int deleteApply(@Param("applyId") Integer applyId);
    public List<Apply> queryApplyList(ApplyQuery applyQuery);
}
