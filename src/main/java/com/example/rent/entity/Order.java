package com.example.rent.entity;

import java.util.Date;

public class Order {
    private String orderId;
    private String carId;
    private String userId;
    private Date create_time;
    private Date end_time;
    private Date return_time;

    @Override
    public String
    toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", carId='" + carId + '\'' +
                ", userId='" + userId + '\'' +
                ", create_time=" + create_time +
                ", end_time=" + end_time +
                ", return_time=" + return_time +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getReturn_time() {
        return return_time;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
    }
}
