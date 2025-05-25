package com.chargingtimerreactnative;

import android.os.Bundle;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.chargingtimerreactnative.BuildConfig;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.JavaScriptModule;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ReactActivityDelegate mReactActivityDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize SoLoader for React Native
        SoLoader.init(this, false);

        // Set the content view (Ensure activity_main.xml exists in res/layout)
        setContentView(R.layout.activity_main);

        // Initialize ReactActivityDelegate for React Native lifecycle handling
        mReactActivityDelegate = new ReactActivityDelegate(this, getMainComponentName());

        // Calling onCreate() on ReactActivityDelegate
        mReactActivityDelegate.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onDestroy();
        }
    }

    // Override to return your React Native JS entry point
    protected String getMainComponentName() {
        return "ChargingTimerReactNative"; // This is your JS entry point (usually index.js)
    }
}
