package com.asozero.model;

import java.util.Date;
import lombok.Data;

@Data
public class Admin {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String department;

    private String email;

    private Boolean isEnabled;

    private Boolean isLocked;

    private Date lockedDate;

    private Date loginDate;

    private Date lastLoginDate;

    private Integer loginFailureCount;

    private String loginIp;

    private String name;

    private String password;

    private String username;
}