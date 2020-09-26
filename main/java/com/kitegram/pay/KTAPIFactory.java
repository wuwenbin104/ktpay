package com.kitegram.pay;

import android.content.Context;
import android.content.pm.PackageManager;

public class KTAPIFactory {
    private  static IKTAPI m_ktApi = null;
    private  static  Context m_context  = null;
    public static  IKTAPI createWXAPI(Context context)
    {
        m_context = context;
        m_ktApi = new IKTAPI();
        return m_ktApi;

    }
    public  static Context GetContext()
    {
        return m_context;
    }
    public static boolean isAppInstalled(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
