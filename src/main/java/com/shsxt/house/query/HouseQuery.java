package com.shsxt.house.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HouseQuery {
    private Integer pageNum=1;
    private Integer pageSize=5;
    private Integer userId;
    private String houseName;
    private String province;
    private String city;
    private String district;
    private String[] priceList;
    private String[] areaList;
}
