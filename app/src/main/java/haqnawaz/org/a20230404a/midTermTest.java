package haqnawaz.org.a20230404a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class midTermTest extends AppCompatActivity {

    private static final String TAG = "Activity Life Cycl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_term_test);
        Log.d(TAG, " onCreate Activity Main");
    }


}