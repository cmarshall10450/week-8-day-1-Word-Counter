package com.cmarshall10450.wordcounter;


import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

  @Test
  public void testCanCountWords() {
    int wordCount = WordCounter.countWords("Hello World");
    assertEquals(2, wordCount);
  }

  @Test
  public void testCanGetWordOccurrences() {
    String text = "It it it was was was";
    HashMap<String, Integer> words = new HashMap<>();
    words.put("it", 3);
    words.put("was", 3);

    assertEquals(words.entrySet(), WordCounter.getWordOccurences(text).entrySet());
  }

}
