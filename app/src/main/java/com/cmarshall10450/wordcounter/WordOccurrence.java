package com.cmarshall10450.wordcounter;


import android.support.annotation.NonNull;

public class WordOccurrence implements Comparable<WordOccurrence> {

  private String word;
  private int occurrence;

  public WordOccurrence(String word, int occurrence) {
    this.word = word;
    this.occurrence = occurrence;
  }

  @Override
  public int compareTo(@NonNull WordOccurrence o) {
    if (occurrence < o.getOccurrence()) {
      return -1;
    } else if (occurrence > o.getOccurrence()) {
      return 1;
    } else {
      return 0;
    }
  }

  public String getWord() {
    return word;
  }

  public int getOccurrence() {
    return occurrence;
  }
}
