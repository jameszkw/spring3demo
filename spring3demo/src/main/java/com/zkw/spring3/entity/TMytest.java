package com.zkw.spring3.entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class TMytest {
    private String userId;
    private String userName;
    private Date userBirthday;
    private double userSalary;

    public double getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(double userSalary) {
        this.userSalary = userSalary;
    }

    public Date getUserBirthday() {

        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TMytest{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userBirthday=" + userBirthday +
                ", userSalary=" + userSalary +
                '}';
    }
}
