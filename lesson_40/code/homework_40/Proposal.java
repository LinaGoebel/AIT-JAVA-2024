package homework_40;

import java.util.HashSet;
import java.util.Set;

//Дано предложение Ф.М.Достоевского:
//
//"Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей,
// - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком."
//Сколько в нем уникальных слов? А сколько в нем уникальных символов?
public class Proposal {

  public static void main(String[] args) {
    String proposal = "Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей, - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком.";
    String[] words = proposal.split(" ");
    int l = words.length;
    System.out.println("Words in proposal: " + l);

    Set<String> uniqueWords = new HashSet<>();
    for (String s : words) {
      uniqueWords.add(s);
    }
    System.out.println(uniqueWords);
    System.out.println();
    System.out.println("Quantity unique words: " + uniqueWords.size());
    System.out.println("====================");
    Set<Character> uniqueChars = new HashSet<>();
    for (char c : proposal.toCharArray()) {
      uniqueChars.add(c);
    }

    System.out.println(uniqueChars);
    System.out.println();
    System.out.println("Quantity unique chars: " + uniqueChars.size());

    System.out.println("====================");
    Set<Character> symbols = new HashSet<>();
    for (char c : proposal.toCharArray()) {
      if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) != -1) {
        symbols.add(c);
      }
    }
    System.out.println(symbols);
    System.out.println();
    System.out.println("Quantity symbols: " + symbols.size());
  }

}
