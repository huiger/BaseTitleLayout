package com.huige.basetitlelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huige.library.BaseTitleLayout;

public class MainActivity extends AppCompatActivity {

    BaseTitleLayout titleLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titleLayout2 = (BaseTitleLayout) findViewById(R.id.titleLayout2);


        titleLayout2.setLeftText("返回");

    }
}
