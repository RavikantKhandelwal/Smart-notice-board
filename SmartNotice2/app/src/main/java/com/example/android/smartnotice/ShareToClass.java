package com.example.android.smartnotice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShareToClass extends Activity {
    private Button SeA;
    private Button SeB;
    private Button TeA;
    private Button TeB;
    private Button BeA;
    private Button BeB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_to_class);
        final String b=getIntent().getStringExtra("mytext");
        SeA=(Button)findViewById(R.id.S_EExtcA);
        SeB=(Button)findViewById(R.id.S_EExtcB);
        TeA=(Button)findViewById(R.id.T_EExtcA);
        TeB=(Button)findViewById(R.id.T_EExtcB);
        BeA=(Button)findViewById(R.id.B_EExtcA);
        BeB=(Button)findViewById(R.id.B_EExtcB);
        SeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
        SeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
        TeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
        TeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
        BeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
        BeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage("+91xxxxxxxxxx",b);
            }
        });
    }

    private void SendMessage(String a,String c){

        SmsManager.getDefault().sendTextMessage(a, null, c, null, null);
        Toast.makeText(ShareToClass.this, "message send", Toast.LENGTH_SHORT).show();
    }
}
