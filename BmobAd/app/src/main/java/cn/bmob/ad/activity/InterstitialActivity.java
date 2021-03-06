package cn.bmob.ad.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.bmob.ad.R;
import cn.bmob.ad.base.BaseActivity;
import cn.bmob.ad.type.FeedsInterstitialView;


/**
 * Created on 17/11/29 08:49
 */

public class InterstitialActivity extends BaseActivity {




    private FeedsInterstitialView mFeedsInterstitialView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        mFeedsInterstitialView  = new FeedsInterstitialView(this);
        //图片地址、广告地址
        mFeedsInterstitialView.loadFeeds("https://www.youmi.net/uploads/images/2018-04-27-17-10-37.jpg","https://engine.easytui.com.cn/activities?appkey=8e60b3bebd65495caf3bfcd25e928125&adslotid=10691&mediatype=3");
    }

    @Override
    protected void onDestroy() {
        if (mFeedsInterstitialView!=null){
            mFeedsInterstitialView.destroy();
        }
        super.onDestroy();
    }
}
