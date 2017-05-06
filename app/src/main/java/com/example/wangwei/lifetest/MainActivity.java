package com.example.wangwei.lifetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//Android生命周期查看，使用Log.i追踪查看
//创建工程
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeTest","onCreate");
    }
//开始工程
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeTest","onStart");
    }
// 重启工程
@Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeTest","onRestart");
    }
//继续工程
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeTest","onResume");
    }
//暂停工程
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeTest","onPause");
    }
//停止工程
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeTest","onStop");
    }
//销毁工程
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeTest","onDestroy");
    }
}
