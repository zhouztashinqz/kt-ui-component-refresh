package com.snowofsunflower.android.ui.refresh;

/**
 * Created by zhouztashin on 2018/10/30.
 * 刷新框架
 */

interface IRefreshLayout {


    /**
     * 刷新配置
     */
    var mSetting: RefreshSetting?

    /**
     * 刷新回调
     */
    fun setRefreshListener(onRefresh: (IRefreshLayout) -> Unit)

    /**
     * 启用刷新
     */
    fun enable()

    /**
     * 禁用刷新
     */
    fun unable()

    /**
     * 刷新完成
     */
    fun complete()

    /**
     *执行刷新
     */
    fun refresh()

}
