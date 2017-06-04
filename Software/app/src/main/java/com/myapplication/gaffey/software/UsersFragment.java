package com.myapplication.gaffey.software;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by 72356 on 2017/6/4.
 */

public class UsersFragment extends AppCompatDialogFragment {

    private ArrayList<User> users=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.friends_layout,container,false);

        users=UsersLab.get(getActivity()).getUsers();
        UsersAdapter adapter=new UsersAdapter(users);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView =(RecyclerView)v.findViewById(R.id.users_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return v;
    }

}
