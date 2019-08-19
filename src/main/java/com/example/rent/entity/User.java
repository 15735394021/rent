package com.example.rent.entity;

public class User {
    private String userId;
    private String userName;
    private String sex;
    private String userTelephone;
    private String userCard;
    private String userStatus;
    private String carLevel;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                ", userCard='" + userCard + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", carLevel='" + carLevel + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }
}
