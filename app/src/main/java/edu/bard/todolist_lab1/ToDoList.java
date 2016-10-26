package edu.bard.todolist_lab1;
/*
  Most basic Todo List in one activity, no fragments.
  Created by Mubasil by help from Marley, and the following websites:

  1) https://guides.codepath.com/android/Creating-and-Using-Fragments
  2) http://www.survivingwithandroid.com/2013/04/android-fragment-transaction.html

  and also from the moodle fragment pdf.


CMSC 374
HW #2 Fragments: Feedback

Names: Alexzandra and Mubasil

     Rubric
----------------------------------------------------------
20	1. App functions correctly from end user perspective.
10	2. Fragments are correctly created.
0	3. Fragments share information on the adapter arraylist.
10	4. Code is clearly commented.
20	5. Code is readable and well constructed.

Score: 60


----------------

Comments

My comments in your code are marked with XX in a comment.



1. App functions correctly from end user perspective. YES, resources used, too.

2. Fragments are correctly created.
You create the listview fragment, but do not bind it with the item
view fragment.

3. Fragments share information on the adapter arraylist.   Using
statics is not quite the right approach, since it's too limiting.


4. Code is clearly commented at most spots.

5. Code is readable and well constructed.
Yes...good throughout, though too much commented-out code you should
just delete.




 */
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ToDoList extends FragmentActivity {
    public static String TAG = "todolab";
    private EditText mEditText; // enter todo item
    private Button mItemButton; // add the item to the list

    @Override
    public void onCreate(Bundle stuff) {
        super.onCreate(stuff);

        // Inflate your view
        setContentView(R.layout.main); // Extracts resources, autogenerates R.java from XML file

        // FragmentManager (Add ListView Fragment)
        FragmentTransaction list_view_fragment = getSupportFragmentManager().beginTransaction();
        list_view_fragment.add(R.id.myListView, new List_View());
        list_view_fragment.commit();
/*
       // Create Fragment Manager
       FragmentManager fm = getFragmentManager();
       Fragment listItems = fm.findFragmentById(R.id.myListView);
       Fragment inputFrag = fm.findFragmentById(R.id.myInputView);  // textfield fragment

       if (inputFrag == null) {
           inputFrag = new InputFragment();
           fm.beginTransaction().add(R.id.myInputView, inputFrag).commit();
       }

       if (listItems == null) {
           listItems = new List_View();
           fm.beginTransaction().add(R.id.myListView, listItems).commit();
       }
 */

        // Get references to UI widgets
        mEditText = (EditText) findViewById(R.id.myEditText);
        mItemButton = (Button) findViewById(R.id.addButton);


        // Add key listener to add the new todo item
        // when the middle D-pad button is pressed.
        mItemButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                List_View.mToDoItems.add(0, mEditText.getText().toString());
                List_View.aa.notifyDataSetChanged();
                mEditText.setText("");
            }
        });

        Log.i(TAG, "Entered onCreate");
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
