package com.example.hcsappmvvm.viewmodel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hcsappmvvm.interfaces.AddAppeal;
import com.example.hcsappmvvm.model.Appeal;
import com.example.hcsappmvvm.repo.RepositoryContoller;

import java.util.List;

public class AddAppealViewModel extends ViewModel {
    public void addAppeal(Appeal appeal){
        RepositoryContoller.getAddAppeal().addAppeal(appeal);
    }
    public MutableLiveData<List<Appeal>> getAppeals(){
        return (MutableLiveData<List<Appeal>>) RepositoryContoller.getAppealsList().getappealsList();
    }
}
