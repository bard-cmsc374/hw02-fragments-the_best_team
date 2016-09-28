package edu.bard.todolist_lab1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*

Created by Mubasil Bokhari taken help from http://www.codota.com/android/scenarios/52fcbdf5da0afbd8360ac166/android.support.v4.app.ListFragment?tag=dragonfly

and
 */
import java.util.ArrayList;

public class List_View extends Fragment {
    public static ArrayList<String> mToDoItems; // list of items
    public static ArrayAdapter<String> aa; // adapter from list to viewlist
    public ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

             View v =    inflater.inflate(R.layout.listview, parent, false);
             return v;
        //   mToDoItems.add(0, mEditText.getText().toString()); //instead notify frag 2 to do this
        // aa.notifyDataSetChanged();
        //  mEditText.setText("");

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

        // Get Reference to UI widgets
        mListView = (ListView) view.findViewById(R.id.myListView);

        // Create the ArrayList and the ArrayAdapter
        mToDoItems = new ArrayList<>();
        aa = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mToDoItems);

        // Bind the listview to the array adapter
        mListView.setAdapter(aa);

    }


}