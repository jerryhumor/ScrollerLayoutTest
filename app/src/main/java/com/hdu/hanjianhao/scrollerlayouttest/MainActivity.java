package com.hdu.hanjianhao.scrollerlayouttest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ScrollerLayoutButtonText> mButtonTextList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtonText();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ScrollerLayoutAdapter adapter = new ScrollerLayoutAdapter(mButtonTextList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initButtonText(){

        ScrollerLayoutButtonText text1 = new ScrollerLayoutButtonText();
        ScrollerLayoutButtonText text2 = new ScrollerLayoutButtonText();
        ScrollerLayoutButtonText text3 = new ScrollerLayoutButtonText();
        ScrollerLayoutButtonText text4 = new ScrollerLayoutButtonText();
        text1.setFirstButtonText("FIRST BUTTON");
        text1.setSecondButtonText("SECOND BUTTON");
        text1.setThirdButtonText("THIRD BUTTON");
        text2.setFirstButtonText("FIRST BUTTON");
        text2.setSecondButtonText("SECOND BUTTON");
        text2.setThirdButtonText("THIRD BUTTON");
        text3.setFirstButtonText("FIRST BUTTON");
        text3.setSecondButtonText("SECOND BUTTON");
        text3.setThirdButtonText("THIRD BUTTON");
        text4.setFirstButtonText("FIRST BUTTON");
        text4.setSecondButtonText("SECOND BUTTON");
        text4.setThirdButtonText("THIRD BUTTON");
        mButtonTextList.add(text1);
        mButtonTextList.add(text2);
        mButtonTextList.add(text3);
        mButtonTextList.add(text4);

    }
}
