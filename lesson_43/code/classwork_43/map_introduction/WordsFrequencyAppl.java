package classwork_43.map_introduction;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl {

  public static void main(String[] args) {
    String[] words = {"abc", "ab", "limit", "ab", "a", "ab", "limit"};
    printWordsFrequency(words);
  }

  private static void printWordsFrequency(String[] words) {
    Map<String, Integer> resMap = new HashMap<>();
    for (String word : words) {
      if (!resMap.containsKey(word)) {
        resMap.put(word, 1);
      } else {
        resMap.put(word, resMap.get(word) + 1);
      }
    }
    System.out.println(resMap);
  }
}
