package com.cmarshall10450.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView wordCountText;
  private EditText textInput;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    wordCountText = findViewById(R.id.word_count);
    textInput = findViewById(R.id.text_input);
  }

  public void onWordCountButtonClick(View button) {
    String textToCount = textInput.getText().toString();
    int wordCount = WordCounter.countWords(textToCount);

    wordCountText.setText(Integer.toString(wordCount));
  }

}
