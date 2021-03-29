package com.shsxt.house.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.MessageDao;
import com.shsxt.house.po.Message;
import com.shsxt.house.query.MessageQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class MessageService {
    @Resource
    private MessageDao messageDao;
    public Message queryMessageById(Integer messageId){
        return messageDao.queryMessageById(messageId);
    }
    public int updateMessage(Message message){
        return messageDao.updateMessage(message);
    }
    public int insertMessage(Message message){
        return messageDao.insertMessage(message);
    }
    public int deleteMessageById(Integer messageId){
        return messageDao.deleteMessageById(messageId);
    }
    public PageInfo<Message> queryMessageList(MessageQuery messageQuery){
        PageHelper.startPage(messageQuery.getPageNum(),messageQuery.getPageSize());
        return new PageInfo<Message>(messageDao.queryMessageList(messageQuery));
    }
}