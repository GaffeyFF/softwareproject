package com.myapplication.gaffey.software;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

/**
 * Created by 72356 on 2017/6/2.
 */

public class RegisterFirstActivity extends Activity {
    Button next;
    AutoCompleteTextView name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_first);
        next = (Button) findViewById(R.id.register_next);
        name = (AutoCompleteTextView) findViewById(R.id.register_name);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterFirstActivity.this, RegisterLastActivity.class);
                i.putExtra(RegisterFinishActivity.CREATE_USER_NAME,name.getText().toString());
                startActivity(i);
                finish();
            }
        });




    }
}
