package com.chargingtimerreactnative;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

public class MainActivity extends ReactActivity {

    // Create ReactActivityDelegate object
    private ReactActivityDelegate mReactActivityDelegate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize SoLoader for React Native (required for native modules)
        SoLoader.init(this, false);

        // Initialize ReactActivityDelegate
        mReactActivityDelegate = new ReactActivityDelegate(this, getMainComponentName());

        // Call ReactActivityDelegate's onCreate method
        mReactActivityDelegate.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onPause();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mReactActivityDelegate != null) {
            mReactActivityDelegate.onDestroy();
        }
    }

    @Override
    protected String getMainComponentName() {
        return "ChargingTimerReactNative"; // Ensure this is the name of your main React Native component
    }
}
