package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //엑티비티 도는 프래그먼트가 생성이 되었을 때 이곳 내부구문들을 실행
        Log.e("onCreate","ENTER");

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //main -> sub
                startActivity(new Intent(MainActivity.this, SubActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","ENTER");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //중지되어있던 액티비티가 다시 재개(재실행) 되는 시점에서 이곳 내부구문들을 실행, 사용자에게 실제로 보여지고 있을때,사용자로 부터 어떠한 값도 받지 않았을때
        Log.e("onResume","ENTER");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //중지 상태(홈버튼을 눌렀을 때, 다른 액티비티가 활성화) 일 때 이곳 내부 구문들을 실행, 액티비티를 다른 액티비티로 전환시킬때
        Log.e("onPause","ENTER");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","ENTER"); //액티비티가 전환된 후에 완전히 바뀌어서 기존액티비티가 보이지 않을때 호출
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //화면이 파괴되어서 소멸되었을 때의 시점에 이곳 내부 구문들을 실행, 초기화시점
        Log.e("onDestroy","ENTER");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart","ENTER");
    }
}