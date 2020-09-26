package com.kitegram.pay;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;

public class IKTAPI {
    private String mPackName="com.client.Kitegram";
    public   void sendReq(PayReq _item)
    {

        if(KTAPIFactory.isAppInstalled(  KTAPIFactory.GetContext(),mPackName))
        {
            Intent intent = new Intent();
            //包名 包名+类名（全路径）
            ComponentName comp = new ComponentName(mPackName,mPackName+".ui.SplashActivity");
            intent.setComponent(comp);
            intent.setAction("android.intent.action.MAIN");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("data", "123");
            KTAPIFactory.GetContext().startActivity(intent);
        }
        else{
            //打开下载页面
            Intent intent = new Intent();
            intent.setData(Uri.parse("https://www.baidu.com"));
            intent.setAction(Intent.ACTION_VIEW);
            KTAPIFactory.GetContext().startActivity(intent);
        }

    }

}
