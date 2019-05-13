package com.example.lenovo.moxycodegenerate;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface MainView extends MvpView {

    @StateStrategyType(OneExecutionStateStrategy.class)
    void showMessage(String view);
}
