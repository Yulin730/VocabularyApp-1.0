package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "红色",R.mipmap.ic_launcher));
        words.add(new Word("yellow", "黄色",R.mipmap.ic_launcher));



        WordAdapter itemAdapter =
                new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemAdapter);




    }
}
