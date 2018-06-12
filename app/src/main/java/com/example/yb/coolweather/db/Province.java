package com.example.yb.coolweather.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private  String provincename; // 省的名字
    private  int provincecode;  //省的代号

    private  int getId(){
        return  id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getProvincecode(){
        return provincecode;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }
}
