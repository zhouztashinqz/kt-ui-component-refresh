package com.snowofsunflower.android.ui.refresh;

/**
 * Created by zhouztashin on 2018/10/30.
 * 刷新框架
 */

public interface IRefreshLayout {


    void setRefreshListener(OnRefreshListener l);
    RefreshSetting getSetting();
    void enable();
    void unable();
    void complete();
    void refresh();

}
