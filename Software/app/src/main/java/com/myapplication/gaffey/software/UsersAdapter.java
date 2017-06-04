package com.myapplication.gaffey.software;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 72356 on 2017/6/4.
 */

public class UsersAdapter  extends  RecyclerView.Adapter<UsersAdapter.ViewHolder>{
    private ArrayList<User> mUserList;
    static  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon;
        TextView name;
        TextView describe;
        public ViewHolder (View v){
            super(v);
            icon=(ImageView)v.findViewById(R.id.list_item_icon);
            name=(TextView)v.findViewById(R.id.list_item_name);
            describe=(TextView)v.findViewById(R.id.list_item_describe);
        }
    }
    public UsersAdapter(ArrayList<User> userList)
    {
        mUserList =userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder holder =new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        User user =mUserList.get(position);
        holder.icon.setImageResource(user.getIcon());
        holder.describe.setText(user.getDescribe());
        holder.name.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }


}
