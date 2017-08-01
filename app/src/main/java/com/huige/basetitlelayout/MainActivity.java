package com.huige.basetitlelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.huige.library.BaseTitleLayout;
import com.huige.library.TitleLayoutClickListener;

public class MainActivity extends AppCompatActivity {

    BaseTitleLayout titleLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titleLayout2 = (BaseTitleLayout) findViewById(R.id.titleLayout2);


        titleLayout2.setLeftText("返回");

        titleLayout2.setOnTitleClickListener(new TitleLayoutClickListener() {
            @Override
            public void onLeftClickListener() {
                super.onLeftClickListener();
                Log.d("msg", "MainActivity -> onLeftClickListener: ");
            }

            @Override
            public void onRightTextClickListener() {
                super.onRightTextClickListener();
                Log.d("msg", "MainActivity -> onRightTextClickListener: ");
            }

            @Override
            public void onRightImg1ClickListener() {
                super.onRightImg1ClickListener();
                Log.d("msg", "MainActivity -> onRightImg1ClickListener: ");
            }

            @Override
            public void onRightImg2ClickListener() {
                super.onRightImg2ClickListener();
                Log.d("msg", "MainActivity -> onRightImg2ClickListener: ");
            }
        });
    }
}
