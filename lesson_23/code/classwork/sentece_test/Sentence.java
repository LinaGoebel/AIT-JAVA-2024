package classwork.sentece_test;

public class Sentence {

  //count word
  public int countWords(String str) {
    String[] words = str.split(" ");
    return words.length;
  }

  //count symbols
  public int countSymbols(String str) {
    String[] letters = str.split("");
    return letters.length;
  }

}
