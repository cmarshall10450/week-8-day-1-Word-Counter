package com.cmarshall10450.wordcounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

  public static int countWords(String text) {
    String[] words = text.split(" ");
    return words.length;
  }

  public static HashMap<String, Integer> getWordOccurrences(String text) {
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

  public static ArrayList<WordOccurrence> getOrderedWordOccurrences(String text) {
    HashMap<String, Integer> wordOccurrences = getWordOccurrences(text);
    ArrayList<WordOccurrence> orderedWordOccurrences = new ArrayList<>();

    for (Map.Entry<String, Integer> wordOccurrence : wordOccurrences.entrySet()) {
      WordOccurrence word = new WordOccurrence(
        wordOccurrence.getKey(),
        wordOccurrence.getValue()
      );

      orderedWordOccurrences.add(word);
    }

    Collections.sort(orderedWordOccurrences, Collections.reverseOrder());
    return orderedWordOccurrences;
  }

  public static String getOccurrencesAsString(String text) {
    ArrayList<WordOccurrence> wordOccurrences = getOrderedWordOccurrences(text);
    String output = "Total words: " + wordOccurrences.size() + "\n";

    for (WordOccurrence occurrence : wordOccurrences) {
      output += occurrence.getWord() + " : " + occurrence.getOccurrence() + "\n";
    }

    return output;
  }
}
