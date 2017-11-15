package com.cmarshall10450.wordcounter;

import org.junit.Test;

import java.util.ArrayList;
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
    String text = "it it it was was a a a a a a a a a a";
    HashMap<String, Integer> words = new HashMap<>();
    words.put("it", 3);
    words.put("was", 3);

    assertEquals(words.entrySet(), WordCounter.getWordOccurrences(text).entrySet());
  }

  @Test
  public void testCanGetWordOccurrencesInOrder() {
    String text = "it it it was was a a a a a a a a a a";
    ArrayList<WordOccurrence> wordOccurrences = new ArrayList<>();
    wordOccurrences.add(new WordOccurrence("a", 10));
    wordOccurrences.add(new WordOccurrence("it", 3));
    wordOccurrences.add(new WordOccurrence("was", 2));

    String expectedWord = wordOccurrences.get(0).getWord();
    String actualWord = WordCounter.getOrderedWordOccurrences(text).get(0).getWord();

    int expectedOccurrences = wordOccurrences.get(0).getOccurrence();
    int actualOccurrences = WordCounter.getOrderedWordOccurrences(text).get(0).getOccurrence();

    assertEquals(expectedWord, actualWord);
    assertEquals(expectedOccurrences, actualOccurrences);
  }

}
