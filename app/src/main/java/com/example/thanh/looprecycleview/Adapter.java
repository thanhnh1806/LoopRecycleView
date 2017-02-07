package com.example.thanh.looprecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Thanh on 2/3/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    public int TOP;
    private List<Job> jobList;

    public Adapter(List<Job> jobList) {
        this.jobList = jobList;
        int mod = (Integer.MAX_VALUE / 2) % jobList.size();
        TOP = (Integer.MAX_VALUE / 2) - mod;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int mod = position % jobList.size();
        Job job = jobList.get(mod);
        holder.textView.setText(job.getTitle());
    }

    @Override
    public int getItemCount() {
        //return jobList.size();
        return Integer.MAX_VALUE;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }
}
