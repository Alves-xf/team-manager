package cn.edu.sdu.ise.labs.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class TeamDTO {
    @NotEmpty(message = "队伍名不能为空")
    private String teamName;

    @NotEmpty(message = "省份不能为空")
    private String province;

    @NotEmpty(message = "联系人不能为空")
    private String contact;

    @NotEmpty(message = "联系电话不能为空")
    private String phone;


    private String description;

    private String teamCode;
}
