package com.example.watchlistapp;

public class User {

    String userName;
    String userID;

    public User() {
        this.userName = "Username";
        this.userID = "0";
    }

    public User(String userName, String userID) {
        this.userName = userName;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}

