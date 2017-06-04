package com.myapplication.gaffey.software;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by 72356 on 2017/6/2.
 */

public class UsersLab {
    private ArrayList<User> Users;
    private  static UsersLab usersLab;
    private Context mAppContex;
    private UsersLab(Context appContex){
        mAppContex=appContex;
        Users=new ArrayList<User>();
        for(int i=1;i<=100;i++) {
            User u = new User();
            u.setId(Integer.toString(10000+Users.size()));
            u.setUuid();
            u.setIcon(R.mipmap.ic_launcher_round);
            u.setName("机器人"+i+"号");
            u.setPassword("123456");
            u.setDescribe("我只是一个机器人");
            Users.add(u);

        }
    }
    public static UsersLab get(Context c)
    {
        if(usersLab ==null){
            usersLab =new UsersLab(c.getApplicationContext());
        }
        return usersLab;
    }

    public int getSize()
    {
       return  Users.size();
    }

    public ArrayList<User> getUsers()
    {
        return Users;

    }

    public User getUser(UUID id)
    {
        for(User u: Users ){
            if(u.getId().equals((id)))
                return u;
        }
        return null;

    }

    public void addUser(User u)
    {
        Users.add(u);
    }
}
