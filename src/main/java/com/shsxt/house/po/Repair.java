package com.shsxt.house.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Repair {
    private Integer repairId;
    private String repairStatus;
    private Integer houseId;
    private Integer userId;
    private String repairNote;
}
