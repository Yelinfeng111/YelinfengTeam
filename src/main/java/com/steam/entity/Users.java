package com.steam.entity;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    public Users() {
    }
    public Users(Integer id, String uuid, String accountName, String infoName, String realName, String description, String password, String photo, String phone, Integer level, Date createDate, String email) {
        this.id = id;
        this.uuid = uuid;
        this.accountName = accountName;
        this.infoName = infoName;
        this.realName = realName;
        this.description = description;
        this.password = password;
        this.photo = photo;
        this.phone = phone;
        this.level = level;
        this.createDate = createDate;
        this.email = email;
    }

    private Integer id;
    private String uuid;
    private String accountName;
    private String infoName;
    private String realName;
    private String description;
    private String password;
    private String photo;
    private String phone;
    private Integer level;
    private Date createDate;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
