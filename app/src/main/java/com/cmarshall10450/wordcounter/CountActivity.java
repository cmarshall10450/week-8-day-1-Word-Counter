package com.cmarshall10450.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

  private TextView wordCountText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_count);

    Intent intent = getIntent();
    Bundle extras = intent.getExtras();
    int wordCount = extras.getInt("wordCount");

    wordCountText = findViewById(R.id.word_count_text);
    wordCountText.setText(Integer.toString(wordCount));
  }
}
