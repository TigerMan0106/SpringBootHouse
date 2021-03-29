package com.shsxt.house.dao;
import com.shsxt.house.po.Message;
import com.shsxt.house.query.MessageQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MessageDao {
    public Message queryMessageById(@Param("messageId")Integer messageId);
    public int updateMessage(Message message);
    public int insertMessage(Message message);
    public int deleteMessageById(@Param("messageId")Integer messageId);
    public List<Message> queryMessageList(MessageQuery messageQuery);
}