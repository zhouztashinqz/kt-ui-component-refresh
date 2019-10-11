package com.snowofsunflower.android.ui.refresh

import `in`.srain.cube.views.ptr.PtrClassicFrameLayout
import `in`.srain.cube.views.ptr.PtrDefaultHandler
import `in`.srain.cube.views.ptr.PtrFrameLayout
import android.content.Context

/**
 * 列表刷新封装类
 */
open class RefreshLayout(context: Context) : PtrClassicFrameLayout(context), IRefreshLayout {
    override var mSetting: RefreshSetting? = null
    /**
     * 默认覆盖
     */
    override fun setRefreshListener(onRefresh: (IRefreshLayout) -> Unit) {

    }

    init {
        setPtrHandler(object : PtrDefaultHandler() {
            override fun onRefreshBegin(frame: PtrFrameLayout) {
                //  mListener?.onRefresh(this@RefreshLayout)
            }

        })
    }


    override fun enable() {
        isEnabled = true
    }

    override fun unable() {
        isEnabled = false
    }

    override fun complete() {
        refreshComplete()
    }

    override fun refresh() {
        autoRefresh()
    }

}