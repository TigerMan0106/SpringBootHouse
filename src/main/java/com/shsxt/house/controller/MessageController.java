package com.shsxt.house.controller;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.po.Message;
import com.shsxt.house.query.MessageQuery;
import com.shsxt.house.service.MessageService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/message")
public class MessageController {
    @Resource
    private MessageService messageService;
    @GetMapping("queryMessage")
    public PageInfo<Message> queryMessage(MessageQuery messageQuery){
        return messageService.queryMessageList(messageQuery);
    }
    @PostMapping("addMessage")
    public Object addMessage(@RequestBody Message message){
        Map<Object,Object> map=new HashMap<>();
        if (messageService.insertMessage(message)==1){
            map.put("msg","添加成功");
            map.put("code",200);
        }else {
            map.put("msg","添加失败");
            map.put("code",300);
        }
        return map;
    }
    @PutMapping("updateMessage")
    public Object updateMessage(@RequestBody Message message){
        Map<Object,Object> map=new HashMap<>();
        if (messageService.updateMessage(message)==1){
            map.put("msg","修改成功");
            map.put("code",200);
        }else {
            map.put("msg","修改失败");
            map.put("code",300);
        }
        return map;
    }
    @DeleteMapping("deleteMessage")
    public Object deleteMessage(Integer messageId){
        Map<Object,Object> map=new HashMap<>();
        if (messageService.deleteMessageById(messageId)==1){
            map.put("msg","删除成功");
            map.put("code",200);
        }else {
            map.put("msg","删除失败");
            map.put("code",300);
        }
        return map;
    }
    @GetMapping("getMessage")
    public Message getMessage(Integer messageId){
        return messageService.queryMessageById(messageId);
    }
}