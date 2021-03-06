package com.kuanggang.gankapp.function.gankdetail;

import android.app.Activity;

import com.kuanggang.gankapp.base.BasePresenter;
import com.kuanggang.gankapp.base.BaseView;
import com.kuanggang.gankapp.model.GankCategory;
import com.kuanggang.gankapp.model.param.GankRequestParam;
import com.kuanggang.gankapp.model.param.GankResponseParam;

/**
 * @author by KG on 2017/6/5.
 */

interface GankContract {

    interface View extends BaseView<Presenter> {
        void onRefreshLoadOk();

        void showGankData(GankResponseParam mResponseParam);

        void showRefreshAnim();

        void scrollToHead();
    }

    interface Presenter extends BasePresenter {
        void loadFirstPage();

        void loadNextPage();

        void showGankDataByCategory();

        GankRequestParam getRequestParams();

        GankResponseParam getResponseParams();

        void checkNewVersion(Activity activity);

        void onDestory();

    }
}
