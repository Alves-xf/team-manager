package cn.edu.sdu.ise.labs.model;

import lombok.Data;

import java.util.Date;

@Data
public class Athlete {
    private Integer id;

    private String athleteCode;

    private String regCode;

    private String teamCode;

    private String name;

    private String idNumber;

    private String idType;

    private String gender;

    private Integer age;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;
}