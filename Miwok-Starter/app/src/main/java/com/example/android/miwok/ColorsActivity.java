package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        Word c = new Word("red","weṭeṭṭi");
        colors.add(c);
        colors.add(new Word("green", "chokokki"));
        colors.add(new Word("brown", "ṭakaakki"));
        colors.add(new Word("gray", "ṭopoppi"));
        colors.add(new Word("black", "kululli"));
        colors.add(new Word("white", "kelelli"));
        colors.add(new Word("yellow", "ṭopiisә"));
        colors.add(new Word("mustard yellow", "chiwiiṭә"));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
