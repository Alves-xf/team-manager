package cn.edu.sdu.ise.labs.model;

import lombok.Data;

import java.util.Date;

@Data
public class Team {
    private Integer id;

    private String teamCode;

    private String teamName;

    private String province;

    private String contact;

    private String phone;

    private String description;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

}