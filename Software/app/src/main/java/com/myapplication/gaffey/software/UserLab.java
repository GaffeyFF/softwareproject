package com.myapplication.gaffey.software;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by 72356 on 2017/6/2.
 */

public class UserLab extends User {
    User user;
    private ArrayList<User> friends;
    private  static UserLab userLab;
    private UserLab(){
        friends=new ArrayList<User>();
        for(int i=1;i<=100;i++) {
            User u = new User();
            u.setId(Integer.toString(10000+i));
            u.setUuid();
            u.setIcon(R.mipmap.ic_launcher);
            u.setName("机器人"+i+"号");
            u.setPassword("123456");
            friends.add(u);
        }
    }
    public static UserLab get(Context c)
    {
        if(userLab ==null){
            userLab =new UserLab();
        }
        return userLab;
    }

    public ArrayList<User> getfriends()
    {
        return friends;

    }

    public User getUser(UUID id)
    {
        for(User u: friends ){
            if(u.getId().equals((id)))
                return u;
        }
        return null;

    }

    public void addUser(User u)
    {
        friends.add(u);
    }
}
