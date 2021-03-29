package com.shsxt.house.po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private Integer messageId;
    private String messageName;
    private String messageContent;
    private String createTime;
    private String createUser;
}