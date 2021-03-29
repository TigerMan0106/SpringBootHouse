package com.shsxt.house.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.ApplyDao;
import com.shsxt.house.po.Apply;
import com.shsxt.house.query.ApplyQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class ApplyService {
    @Resource
    private ApplyDao applyDao;
    public Apply queryApplyById( Integer applyId){
        return applyDao.queryApplyById(applyId);
    }
    public int insertApply(Apply apply){
        return applyDao.insertApply(apply);
    }
    public int updateApply(Apply apply){
        return applyDao.updateApply(apply);
    }
    public int deleteApply( Integer applyId){
        return applyDao.deleteApply(applyId);
    }
    public PageInfo<Apply> queryApplyList(ApplyQuery applyQuery){
        PageHelper.startPage(applyQuery.getPageNum(),applyQuery.getPageSize());
        return new PageInfo<Apply>(applyDao.queryApplyList(applyQuery));
    }
}