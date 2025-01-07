/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recipeease.utils;

/**
 *
 * @author pistachya
 */
public class Notification {
    private int notificationID;
    private int userID;
    private String message;
    private String timestamp;

    public Notification(int notificationID, int userID, String message, String timestamp) {
        this.notificationID = notificationID;
        this.userID = userID;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getNotificationID() {
        return notificationID;
    }
    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void sendNotification() {
        // Kodingan untuk mengirim notifikasi kepada user/pengguna
    }
}

