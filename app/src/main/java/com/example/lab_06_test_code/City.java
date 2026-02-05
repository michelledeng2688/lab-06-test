package com.example.lab_06_test_code;

/**
 * This is a class that defines a City.
 */
public class City {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
}
