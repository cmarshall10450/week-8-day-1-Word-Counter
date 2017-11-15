package com.cmarshall10450.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OrderedWordsActivity extends AppCompatActivity {

  private TextView orderedWords;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ordered_words);

    orderedWords = findViewById(R.id.ordered_words);

    Intent intent = getIntent();
    Bundle extras = intent.getExtras();

    orderedWords.setText(extras.getString("orderedWords"));
  }
}
