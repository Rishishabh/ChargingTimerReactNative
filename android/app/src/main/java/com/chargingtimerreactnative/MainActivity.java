package com.chargingtimerreactnative;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.JavaScriptModule;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ReactInstanceManager mReactInstanceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);  // Apply AppCompat theme

        // Initialize the React Native instance
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index")  // Your JS entry point
                .setUseDeveloperSupport(BuildConfig.DEBUG)  // Use the debug settings
                .setPackageName(getPackageName())
                .addPackage(new MainReactPackage())  // Add necessary packages
                .build();

        SoLoader.init(this, /* native exopackage */ false);
        setContentView(R.layout.activity_main);  // Set the content view
    }

    @Override
    protected void onResume() {
        super.onResume();
        mReactInstanceManager.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mReactInstanceManager.onPause(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mReactInstanceManager.onDestroy(this);
    }
}
