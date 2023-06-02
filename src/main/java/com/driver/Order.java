package com.driver;

import io.swagger.models.auth.In;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.deliveryTime = TimeUtil.convertTime(deliveryTime);
        this.id = id;
    }

//    private int convertDeliveryTime(String deliveryTime) {
//        String[] time = deliveryTime.split(":");
//        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
//    }
//
//    public String convertDeliveryTime(int deliveryTime) {
//        int hh = deliveryTime/60;
//        int mm = deliveryTime % 60;
//        String HH = String.valueOf(hh);
//        String MM = String.valueOf(mm);
//        return String.format("%s:%s", HH, MM);
//    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}

    public String getDeliveryTimeAsString() {
        return TimeUtil.convertTime(this.deliveryTime);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = TimeUtil.convertTime(deliveryTime);
    }
}
