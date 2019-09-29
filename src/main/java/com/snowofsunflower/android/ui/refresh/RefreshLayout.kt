package com.snowofsunflower.android.ui.refresh

import `in`.srain.cube.views.ptr.PtrClassicFrameLayout
import `in`.srain.cube.views.ptr.PtrDefaultHandler
import `in`.srain.cube.views.ptr.PtrFrameLayout
import android.content.Context

open class RefreshLayout(context: Context) : PtrClassicFrameLayout(context), IRefreshLayout {
    override fun setRefreshListener(l: OnRefreshListener) {

    }

    override var mSetting: RefreshSetting? = null

    init {
        setPtrHandler(object : PtrDefaultHandler() {
            override fun onRefreshBegin(frame: PtrFrameLayout) {
                // mListener?.onRefresh(this@RefreshLayout)
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