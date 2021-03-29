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
public class Rent {
    private Integer rentId;
    private Integer houseId;
    private Integer userId;
    private Timestamp startTime;
    private Timestamp endTime;
    private String rentStatus;
}
