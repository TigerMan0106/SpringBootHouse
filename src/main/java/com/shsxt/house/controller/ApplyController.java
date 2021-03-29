package com.shsxt.house.controller;

import com.shsxt.house.po.Apply;
import com.shsxt.house.query.ApplyQuery;
import com.shsxt.house.service.ApplyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apply")
public class ApplyController {
    @Resource
    private ApplyService applyService;
    @GetMapping("getApply")
    public Object getApply(Integer applyId){
        return applyService.queryApplyById(applyId);
    }
    @GetMapping("applyList")
    public Object applyList(ApplyQuery applyQuery){
        return applyService.queryApplyList(applyQuery);
    }
    @PostMapping("insertApply")
    public Object insertApply(@RequestBody Apply apply){
        Map<Object,Object> map=new HashMap<>();
        if (applyService.insertApply(apply)==1){
            map.put("msg","添加成功");
            map.put("code",200);
        }else {
            map.put("msg","添加失败");
            map.put("code",300);
        }
        return map;
    }
    @PutMapping("updateApply")
    public Object updateApply(@RequestBody Apply apply){
        Map<Object,Object> map=new HashMap<>();
        if (applyService.updateApply(apply)==1){
            map.put("msg","修改成功");
            map.put("code",200);
        }else {
            map.put("msg","修改失败");
            map.put("code",300);
        }
        return map;
    }
    @DeleteMapping("deleteApply")
    public Object deleteApply(Integer applyId){
        Map<Object,Object> map=new HashMap<>();
        if (applyService.deleteApply(applyId)==1){
            map.put("msg","删除成功");
            map.put("code",200);
        }else {
            map.put("msg","删除失败");
            map.put("code",300);
        }
        return map;
    }
}
