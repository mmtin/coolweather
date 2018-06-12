package com.example.yb.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private  int id;
    private String cityname; //城市名字
    private  int citycode;//城市代号
    private  int provinceid; //当前市所属的省的id值

    public int getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCitycode(){
        return  citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid){
        this.provinceid = provinceid;
    }
}
