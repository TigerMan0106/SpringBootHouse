package com.shsxt.house.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Apply {
    private Integer applyId;
    private Integer houseId;
    private Integer userId;
    private String applyStatus;
    private Timestamp startTime;
    private Timestamp endTime;
    private String ownerName;
    private String userRealName;
    private String houseName;
}
