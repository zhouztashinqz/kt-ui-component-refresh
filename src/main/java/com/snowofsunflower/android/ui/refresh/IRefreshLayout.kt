package com.snowofsunflower.android.ui.refresh;

/**
 * Created by zhouztashin on 2018/10/30.
 * 刷新框架
 */

interface IRefreshLayout {


    var mSetting: RefreshSetting?

    fun setRefreshListener(l: OnRefreshListener)
    fun enable()
    fun unable()
    fun complete()
    fun refresh()

}
