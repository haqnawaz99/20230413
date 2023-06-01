package haqnawaz.org.a20230404a;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG = "Activity Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d(TAG, " onCreate Activity Main");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Activity Main");
    }
    @Override
    protected void onResume() {
        super. onResume();
        Log.d(TAG, " onResume Activity Main");
    }
    @Override
    protected void onPause() {
        super. onPause();
        Log.d(TAG, " onPause Activity Main");
    }
    @Override
    protected void onStop() {
        super. onStop();
        Log.d(TAG, " onStop Activity Main");
    }
    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d(TAG, " onDestroy Activity Main");
    }

}