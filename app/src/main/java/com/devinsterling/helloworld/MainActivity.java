// Devin Sterling
// 2022 - 05 - 29
// HelloWorld App

package com.devinsterling.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Show toast message */
        Button showToastButton = (Button) findViewById(R.id.showToastButton);

        showToastButton.setOnClickListener((clickEvent) -> {
            Toast.makeText(getApplicationContext(),
                            "https://github.com/DevinSterling/Android_HelloWorld",
                            Toast.LENGTH_SHORT)
                    .show();
        });
    }
}