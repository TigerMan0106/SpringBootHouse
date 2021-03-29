package com.shsxt.house.controller;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.po.House;
import com.shsxt.house.query.HouseQuery;
import com.shsxt.house.service.HouseService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/house")
public class HouseController {
    @Resource
    private HouseService houseService;
    @GetMapping("getHouse")
    public House getHouse(Integer houseId){
        return houseService.queryHouseById(houseId);
    }
    @GetMapping("queryHouseList")
    public PageInfo<House> queryHouseList(HouseQuery houseQuery){
        return houseService.queryHouseList(houseQuery);
    }
    @PostMapping("addHouse")
    public Object addHouse(@RequestBody House house){
        Map<Object,Object> map=new HashMap<>();
        int count=houseService.insertHouse(house);
        int houseId=house.getHouseId();
        if (count==1){
            map.put("msg","添加成功");
            map.put("houseId",houseId);
            map.put("code",200);
        }else {
            map.put("msg","添加失败");
            map.put("code",300);
        }
        return map;
    }
    @DeleteMapping("deleteHouse")
    public Object deleteHouse(Integer houseId){
        Map<Object,Object> map=new HashMap<>();
        if (houseService.deleteHouseById(houseId)==1){
            map.put("msg","删除成功");
            map.put("code",200);
        }else {
            map.put("msg","删除失败");
            map.put("code",300);
        }
        return map;
    }
    @PutMapping("updateHouse")
    public Object updateHouse(@RequestBody House house){
        Map<Object,Object> map=new HashMap<>();
        if (houseService.updateHouse(house)==1){
            map.put("msg","修改成功");
            map.put("code",200);
        }else {
            map.put("msg","修改失败");
            map.put("code",300);
        }
        return map;
    }
}
