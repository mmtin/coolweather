package com.example.yb.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport{
    private int id;
    private  String countyname; //县的名字
    private  String weatherid; // 县对应的天气的id 值
    private  int cityid; //县所属的市的id 值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname){
        this.countyname = countyname;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

    public int getCityid(){
        return cityid;
    }

    public void setCityid(int cityid){
        this.cityid = cityid;
    }
}
