package classwork.sentece_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SentenceTest {

  Sentence sentence;

  @BeforeEach
  void setUp() {
    sentence = new Sentence();
  }

  @Test
  void countWords() {
    String str = "One two three four";
    assertEquals(4, sentence.countWords(str));
  }

  @Test
  void countSymbols() {
    String str = "One? Two. Three";
    assertEquals(15, sentence.countSymbols(str));

  }
}