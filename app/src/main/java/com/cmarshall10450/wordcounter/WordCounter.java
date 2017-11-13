package com.cmarshall10450.wordcounter;


import java.util.HashMap;

public class WordCounter {

  public static int countWords(String text) {
    String[] words = text.split(" ");
    return words.length;
  }

  public static HashMap<String, Integer> getWordOccurences(String text) {
    HashMap<String, Integer> wordOccurrences = new HashMap<>();

    String[] words = text.toLowerCase().split(" ");
    for (String word : words) {
      if (wordOccurrences.containsKey(word)) {
        int newValue = wordOccurrences.get(word) + 1;
        wordOccurrences.put(word, newValue);
      } else {
        wordOccurrences.put(word, 1);
      }
    }

    return wordOccurrences;
  }

}
