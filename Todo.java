package com.example.cs374.thetodo;

import java.util.UUID;

/**
 * Created by cs374 on 9/27/16.

 import java.util.UUID;

 /**
 * Created by cs374 on 9/25/16.
 */
public class Todo {
    public UUID getId() {
        return mId;
    }

    private UUID mId;
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String toString(){
        return getTitle();
    }

    public Todo(){

        //generate unique identifier
        mId = UUID.randomUUID();
    }




}
