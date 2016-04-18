package www.icebd.com.suzukimenu;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 3/10/2016.
 */
public class MyApplication extends Application {

    private static MyApplication sInstance=null;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance=this;
    }

    public static MyApplication getInstance(){
        return sInstance;
    }

    public static Context getAppContext(){
        return sInstance.getApplicationContext();
    }

}
