package com.cmarshall10450.wordcounter;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

  @Test
  public void testCanCountWords() {
    int wordCount = WordCounter.countWords("Hello World");
    assertEquals(2, wordCount);
  }

}
