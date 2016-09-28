package com.example.cs374.thetodo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class ToDoList extends FragmentActivity {
    public static String TAG = "todolab";
    private EditText mEditText; // enter todo item
    private Button mItemButton; // add the item to the list
    private ArrayList<String> mToDoItems; // list of items
    private ArrayAdapter<String> aa; // adapter from list to viewlist
    private ListView mListView;

    @Override
    public void onCreate(Bundle stuff) {
        super.onCreate(stuff);

        // Inflate your view
        setContentView(R.layout.main); // Extracts resources, autogenerates R.java from XML file

        FragmentManager fm = getSupportFragmentManager();
        Fragment frag1 = fm.findFragmentById(R.id.add_container);

        //Fragment frag2 = fm.findFragmentById(R.id.list_container);
        //create frag 1
        //create frag 2


        if (frag1 == null) {
            frag1 = new Frag1();
            fm.beginTransaction()
                    .add(R.id.add_container, frag1)
                    .commit();
        }

        mToDoItems = new ArrayList<String>();




      /*
       if (frag2 == null){
           fragment = new Frag2();
           fm.beginTransaction()
                   .add(R.id.add_container, fragment)
                   .commit();
       } */

       /*
       // Get references to UI widgets
       mEditText = (EditText) findViewById(R.id.myEditText);//******
       mItemButton = (Button) findViewById(R.id.addButton);//******
       mListView = (ListView) findViewById(R.id.myListView);

       // Create the ArrayList and the ArrayAdapter
       mToDoItems = new ArrayList<String>();
       aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mToDoItems);

       // Bind the listview to the array adapter
       mListView.setAdapter(aa);

       // Add key listener to add the new todo item
       // when the middle D-pad button is pressed.
       mItemButton.setOnClickListener(new View.OnClickListener() {//******
           public void onClick(View view) {
               mToDoItems.add(0, mEditText.getText().toString()); //instead notify frag 2 to do this
               aa.notifyDataSetChanged();
               mEditText.setText("");
           }
       }); */

        Log.i(TAG, "Entered onCreate");
    }



    public ArrayList<String> update(String s){ //FOR UPDATING STRING
        mToDoItems.add(s);
        System.out.println("s is " + s);
        return mToDoItems;
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entered onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entered onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entered onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entered onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entered onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entered onDestroy");
    }


}



