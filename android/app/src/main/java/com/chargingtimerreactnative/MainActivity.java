package com.chargingtimerreactnative;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.chargingtimerreactnative.R;

public class MainActivity extends ReactActivity {
    @Override
    protected String getMainComponentName() {
        return "ChargingTimerReactNative";
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the theme to ensure AppCompat is used
        setTheme(R.style.AppTheme); // Ensure the correct theme is applied here
    }
}
