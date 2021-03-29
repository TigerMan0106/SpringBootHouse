package com.shsxt.house.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class House {
    private Integer houseId;
    private String houseName;
    private BigDecimal housePrice;
    private String houseStatus;
    private String houseNote;
    private String houseType;
    private Integer userId;
    private String houseArea;
    private String province;
    private String city;
    private String district;
    private String address;
}
