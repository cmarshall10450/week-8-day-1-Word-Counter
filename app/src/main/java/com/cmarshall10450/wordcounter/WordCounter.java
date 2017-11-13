package com.cmarshall10450.wordcounter;


public class WordCounter {

  public static int countWords(String text) {
    String[] words = text.split(" ");
    return words.length;
  }

}
