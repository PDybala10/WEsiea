package com.example.wesiea.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModelOffline extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModelOffline() {
        mText = new MutableLiveData<>();
        mText.setValue("Vous n’êtes pas connecté");
    }

    public LiveData<String> getText() {
        return mText;
    }
}