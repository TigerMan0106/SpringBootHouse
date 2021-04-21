package com.shsxt.house.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApplyQuery {
    private Integer pageNum=1;
    private Integer pageSize=5;
    private Integer houseId;
    private Integer userId;
    private Integer ownerId;
}
