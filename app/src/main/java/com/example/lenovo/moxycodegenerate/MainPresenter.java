package com.example.lenovo.moxycodegenerate;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void onTextViewClicked(String v) {
        getViewState().showMessage(v);
    }
}
