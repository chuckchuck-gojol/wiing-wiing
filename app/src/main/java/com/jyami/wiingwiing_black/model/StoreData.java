package com.jyami.wiingwiing_black.model;

import lombok.Getter;

@Getter
public class StoreData {
    private boolean connection = false;
    private String Username = "민정";

    private static StoreData instance = null;

    public static synchronized StoreData getInstance(){
        if(null == instance){
            instance = new StoreData();
        }
        return instance;
    }

}
