package com.myapplication.gaffey.software;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 72356 on 2017/6/2.
 */

public class RegisterFinishActivity extends Activity {
    public  static String CREATE_USER_NAME;
    public  static String CREATE_USER_PASSWORD;
    private UsersLab mUsers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_finish);
        User user =new User();
        user.setId(Integer.toString(10000+mUsers.getSize()));
        user.setUuid();
        user.setName(CREATE_USER_NAME);
        user.setPassword(CREATE_USER_PASSWORD);
        user.setIcon(R.mipmap.ic_launcher);
        mUsers.addUser(user);

        TextView id =(TextView)findViewById(R.id.show_id);
        id.setText(user.getId().toString());
        Button back =(Button)findViewById(R.id.register_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i= new Intent(RegisterFinishActivity.this ,LogInActivity.class);
//                startActivity(i);
//
                finish();

            }
        });
    }
}
