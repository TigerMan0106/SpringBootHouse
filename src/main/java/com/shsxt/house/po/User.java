package com.shsxt.house.po;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(description = "用户实体类")
public class User {
    @ApiModelProperty(value = "用户Id")
    private Integer userId;
    @ApiModelProperty(value = "用户名")
    @NotBlank(message = "用户名不能为空")
    private String userName;
    @ApiModelProperty(value = "用户真实姓名")
    private String userRealName;
    @ApiModelProperty(value = "用户密码")
    @NotBlank(message = "用户密码不能为空")
    @Length(min=4,max = 10,message = "用户密码的长度至少四位，至多十位")
    private String userPwd;
    @ApiModelProperty(value = "用户性别")
    private String userSex;
    @ApiModelProperty(value = "用户电话")
    private String userPhone;
    @ApiModelProperty(value = "用户角色")
    private String userRole;
}