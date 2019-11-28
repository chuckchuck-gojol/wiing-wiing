package com.jyami.wiingwiing_black.ui.optimizing_memory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OptimizingMemoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OptimizingMemoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}