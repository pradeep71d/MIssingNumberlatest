package com.example.reverse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.SystemUpdateInfo;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {1, 2, 3, 5};
        int n = a.length + 1;
        int x = n * (n + 1) / 2;
        System.out.println(x);
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            y = y + a[i];
        }
        System.out.println(y);
        int z = x - y;
        System.out.println("Missing number is=" + z);
    }
}
