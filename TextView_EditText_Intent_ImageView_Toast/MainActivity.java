package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;
    private Button btn_move;
    private EditText et_test;
    private String str;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id); // et_id와 연결
        btn_test = findViewById(R.id.btn_test); //버튼 연결

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("홍드로이드"); //text 써주고 싶을때
            }
        });

        btn_move = findViewById(R.id.btn_move); //버튼 연결
        et_test = findViewById(R.id.et_test);
        //str = et_test.getText().toString(); 처음 실행했을 때 getText하면 아무것도 없는 게 정상

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str",str); //subActivity로 쐈다!
                startActivity(intent); //액티비티 이동
            }
        });

        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() /*메인액티비티*/, "홍드로이드 Toast", Toast.LENGTH_LONG).show();
            }
        });



    }
}
