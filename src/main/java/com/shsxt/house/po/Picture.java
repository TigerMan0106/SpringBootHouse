package com.shsxt.house.po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.math.BigInteger;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Picture {
    private Integer pictureId;
    private Integer houseId;
    private String pictureUrl;
}
