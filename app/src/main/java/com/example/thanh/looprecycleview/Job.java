package com.example.thanh.looprecycleview;

/**
 * Created by Thanh on 2/3/2017.
 */

public class Job {
    private String id;
    private String title;

    public Job(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
