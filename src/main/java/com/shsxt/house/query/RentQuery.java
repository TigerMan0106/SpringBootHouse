package com.shsxt.house.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentQuery {
    private Integer pageNum=1;
    private Integer pageSize=5;
}