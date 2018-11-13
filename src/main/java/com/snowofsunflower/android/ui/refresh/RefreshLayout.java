package com.snowofsunflower.android.ui.refresh;

import android.content.Context;
import android.util.AttributeSet;


import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/**
 * 封装一层刷新View
 * Created by zhouztashin on 2018/10/24.
 */

public class RefreshLayout extends PtrClassicFrameLayout implements IRefreshLayout {
    public final String TAG = getClass().getSimpleName();
    private OnRefreshListener mListener;
    public RefreshLayout(Context context) {
        super(context);
        initLayout();
    }

    public RefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout();
    }

    public RefreshLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initLayout();

    }
    private void initLayout(){
       setPtrHandler(new PtrDefaultHandler() {
           @Override
           public void onRefreshBegin(PtrFrameLayout frame) {
               if(mListener != null){
                   mListener.onRefresh(RefreshLayout.this);
               }
           }
       });
    }
    @Override
    public void setRefreshListener(OnRefreshListener l) {
        mListener = l;
    }

    @Override
    public RefreshSetting getSetting() {
        return null;
    }

    @Override
    public void enable() {
        this.setEnabled(true);
    }

    @Override
    public void unable() {
        this.setEnabled(false);
    }

    @Override
    public void complete() {
        this.refreshComplete();
    }

    @Override
    public void refresh() {
        this.autoRefresh();
    }
}
