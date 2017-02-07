package com.poojan.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by VNurtureTechnologies on 07/02/17.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<Post> posts;

    CustomAdapter(Context context, ArrayList<Post> posts,LayoutInflater inflater){

        this.context=context;
        this.posts=posts;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    static class ViewHolder{



    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {



        return view;
    }
}
