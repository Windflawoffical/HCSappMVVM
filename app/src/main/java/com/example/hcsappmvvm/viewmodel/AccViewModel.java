package com.example.hcsappmvvm.viewmodel;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.hcsappmvvm.interfaces.RepositoryTasks;
import com.example.hcsappmvvm.model.User;

public class AccViewModel extends ViewModel {
    public RepositoryTasks repositoryTasks = null;

    public void onChangeDataButtonClicked(View view){
        repositoryTasks.ChangeData();
    }
}
