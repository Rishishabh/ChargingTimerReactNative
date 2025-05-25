package com.chargingtimerreactnative;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

public class MainActivity extends AppCompatActivity {

    private ReactActivityDelegate mReactActivityDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize SoLoader for React Native
        SoLoader.init(this, false);

        // Set content view if necessary (you can skip this if your app doesn't have any XML layout)
        setContentView(R.layout.activity_main);

        // Initialize the ReactActivityDelegate, which will handle lifecycle automatically
        mReactActivityDelegate = new ReactActivityDelegate(this, getMainComponentName());

        // Call the ReactActivityDelegate's onCreate method
        mReactActivityDelegate.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        // Make sure that onBackPressed also works for React Native's navigation.
        if (!mReactActivityDelegate.onBackPressed()) {
            super.onBackPressed();
        }
    }

    // Override to return your React Native JS entry point (usually the name of your root component)
    protected String getMainComponentName() {
        return "ChargingTimerReactNative"; // Ensure this matches the JS entry point
    }
}
