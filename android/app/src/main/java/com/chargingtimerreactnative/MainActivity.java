package com.chargingtimerreactnative;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactInstanceManager;
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

public class MainActivity extends AppCompatActivity {

    private ReactInstanceManager mReactInstanceManager;
    private ReactNativeHost mReactNativeHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize React Native Instance Manager
        mReactNativeHost = new ReactNativeHost(getApplication()) {
            @Override
            public boolean getUseDeveloperSupport() {
                return BuildConfig.DEBUG;  // Set to true in Debug mode
            }

            @Override
            public List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(
                        new MainReactPackage()  // Add necessary React packages here
                );
            }

            @Override
            public String getJSMainModuleName() {
                return "index";  // Your JS entry point
            }
        };

        // Initialize ReactInstanceManager with the ReactNativeHost
        mReactInstanceManager = mReactNativeHost.getReactInstanceManager();

        // SoLoader initialization
        SoLoader.init(this, /* native exopackage */ false);

        // Set content view here
        setContentView(R.layout.activity_main);  // Ensure you have an activity_main.xml in res/layout

        // Start React Activity (React Native setup)
        mReactInstanceManager.createReactContextInBackground();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Manually handle React Native lifecycle
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onResume(this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Manually handle React Native lifecycle
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onPause(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Manually handle React Native lifecycle
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onDestroy(this);
        }
    }
}
