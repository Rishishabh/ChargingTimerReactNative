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
import java.util.Arrays;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize SoLoader for React Native
        SoLoader.init(this, false);
        
        // Set the content view
        setContentView(R.layout.activity_main); // Make sure you have activity_main.xml in res/layout

        // ReactActivityDelegate to handle lifecycle events
        ReactActivityDelegate delegate = new ReactActivityDelegate(this, getMainComponentName());
        delegate.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ReactActivityDelegate delegate = new ReactActivityDelegate(this, getMainComponentName());
        delegate.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ReactActivityDelegate delegate = new ReactActivityDelegate(this, getMainComponentName());
        delegate.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ReactActivityDelegate delegate = new ReactActivityDelegate(this, getMainComponentName());
        delegate.onDestroy();
    }

    protected String getMainComponentName() {
        return "ChargingTimerReactNative"; // This is your JavaScript entry point (index.js)
    }
}
