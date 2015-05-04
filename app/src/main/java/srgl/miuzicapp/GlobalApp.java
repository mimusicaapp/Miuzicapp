package srgl.miuzicapp;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by LUIS on 03/05/2015.
 */
public class GlobalApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
