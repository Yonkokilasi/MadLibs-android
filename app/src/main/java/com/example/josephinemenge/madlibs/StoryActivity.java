package com.example.josephinemenge.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView)
    TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String adjective = intent.getStringExtra("adjective");
        String pnoun = intent.getStringExtra("pnoun");
        String noun1 = intent.getStringExtra("noun1");
        String noun2 = intent.getStringExtra("noun2");


        mStoryTextView.setText("Ladies and Gentlemen on this "+ adjective +" occassion it is a privilege to address such a/an " + adjective + " looking group of " + pnoun + "."
                +" I can tell from your smiling " + noun2 + " that you will support my "+ noun1 + " program in the coming election.");
    }
}
