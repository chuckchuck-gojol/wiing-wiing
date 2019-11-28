package com.jyami.wiingwiing_black.ui.checking_connection;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CheckingConnectionViewModel extends ViewModel {

    private MutableLiveData<Boolean> connection=new MutableLiveData<>();

    public CheckingConnectionViewModel(){
        connection.setValue(false);
    }

    public LiveData<Boolean> getConnection() {
        return connection;
    }
}