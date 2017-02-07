package com.example.thanh.looprecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private List<Job> jobList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Job job1 = new Job("1", "Job 1");
        Job job2 = new Job("2", "Job 2");
        Job job3 = new Job("3", "Job 3");
        Job job4 = new Job("4", "Job 4");
        Job job5 = new Job("5", "Job 5");
        Job job6 = new Job("6", "Job 6");
        Job job7 = new Job("7", "Job 7");

        jobList.add(job1);
        jobList.add(job2);
        jobList.add(job3);
        jobList.add(job4);
        jobList.add(job5);
        jobList.add(job6);
        jobList.add(job7);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        SnapHelper snapHelper = new GravitySnapHelper(Gravity.START);
        snapHelper.attachToRecyclerView(recyclerView);
        adapter = new Adapter(jobList);
        recyclerView.setAdapter(adapter);

        CenterZoomLayoutManager layoutManager = new CenterZoomLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.scrollToPosition(adapter.TOP);
    }
}
