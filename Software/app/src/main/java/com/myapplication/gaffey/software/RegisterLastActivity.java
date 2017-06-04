package com.myapplication.gaffey.software;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

/**
 * Created by 72356 on 2017/6/2.
 */

public class RegisterLastActivity extends Activity {

    Button finish;
    AutoCompleteTextView password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_last);
        finish =(Button)findViewById(R.id.register_finish);
        password=(AutoCompleteTextView)findViewById(R.id.register_password);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(RegisterLastActivity.this,RegisterFinishActivity.class);
                i.putExtra(RegisterFinishActivity.CREATE_USER_PASSWORD,password.getText().toString());
                startActivity(i);
                finish();
            }
        });
    }
}
