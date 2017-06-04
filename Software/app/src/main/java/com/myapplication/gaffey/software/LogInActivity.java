package com.myapplication.gaffey.software;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 72356 on 2017/6/1.
 */

public class LogInActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        TextView registerUser=(TextView)findViewById(R.id.register_user);

        registerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(LogInActivity.this,RegisterFirstActivity.class);
                startActivity(i);
            }
        });

        Button sign=(Button)findViewById(R.id.sign_in);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(LogInActivity.this,MainActivity.class);
                startActivity(i);

            }
        });


    }
}
