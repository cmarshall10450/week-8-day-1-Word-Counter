package com.cmarshall10450.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    Intent intent = new Intent(this, CountActivity.class);
    intent.putExtra("wordCount", wordCount);
    startActivity(intent);
  }

  public void onOrderedWordOccurrencesButtonClick(View view) {
    String textToCount = textInput.getText().toString();
    String orderedWords = WordCounter.getOccurrencesAsString(textToCount);

    Intent intent = new Intent(this, OrderedWordsActivity.class);
    intent.putExtra("orderedWords", orderedWords);

    startActivity(intent);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.action_menu, menu);

    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    Intent intent = null;
    switch (item.getItemId()) {
      case R.id.action_about:
        intent = new Intent(this, AboutActivity.class);
        break;
      case R.id.action_settings:
        intent = new Intent(this, SettingsActivity.class);
        break;
    }

    startActivity(intent);

    return true;
  }
}
