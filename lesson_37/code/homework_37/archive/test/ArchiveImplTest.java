package homework_37.archive.test;

import static org.junit.jupiter.api.Assertions.*;

import homework_37.archive.dao.Archive;
import homework_37.archive.dao.ArchiveImpl;
import homework_37.archive.model.Documents;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import javax.sound.midi.Soundbank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchiveImplTest {

  Archive archive;
  Documents[] doc;
  LocalDateTime now = LocalDateTime.now();

  @BeforeEach
  void setUp() {
    archive = new ArchiveImpl(5);
    doc = new Documents[4];
    doc[0] = new Documents(1, 1, "doc1", "url1", now.minusDays(2));
    doc[1] = new Documents(1, 2, "doc2", "url2", now.minusDays(3));
    doc[2] = new Documents(2, 3, "doc3", "url3", now.minusDays(5));
    doc[3] = new Documents(2, 4, "doc4", "url4", now.minusDays(7));
    for (Documents d : doc) {
      archive.addDocuments(d);
      System.out.println(d);
    }
  }

  @Test
  void addDocument() {
    assertFalse(archive.addDocuments(null));
    assertFalse(archive.addDocuments(doc[0]));
    Documents document = new Documents(3, 1, "doc5", "url5", now.minusDays(3));
    assertTrue(archive.addDocuments(document));
    assertEquals(5, archive.size());
    Documents document1 = new Documents(3, 2, "doc6", "url6", now.minusDays(1));
    assertFalse(archive.addDocuments(document1));
  }

  @Test
  void removeDocuments() {
    assertFalse(archive.removeDocuments(5));
    System.out.println("==========after remove==========");
    assertTrue(archive.removeDocuments(1));
    assertEquals(3, archive.size());
    archive.printDocuments();


  }

  @Test
  void updateDocuments() {
    System.out.println("====================");
    assertFalse(archive.updateDocuments(2, 3, "url3"));
    assertTrue(archive.updateDocuments(1, 1, "newUrl"));
    archive.printDocuments();
  }

  @Test
  void getDocumentsFromFolder() {
    System.out.println("====================");
    assertEquals(doc[0], archive.getDocumentsFromFolder(1, 1));
    assertNull(archive.getDocumentsFromFolder(5, 5));
    archive.printDocuments();
  }

  @Test
  void getAllDocumentsFromArchive() {
    Documents[] expected = {doc[0], doc[1]};
    Documents[] actual = archive.getAllDocumentsFromArchive(1);
    Arrays.sort(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  void getDocumentsBetweenDates() {
    Documents[] expected = {doc[0], doc[1]};
    Documents[] actual = archive.getDocumentsBetweenDates(now.minusDays(4).toLocalDate(),
        now.minusDays(1).toLocalDate());
    assertEquals(expected.length, actual.length);
    for (Documents act : actual) {
      assertEquals(expected[0].getIdFolder(), actual[0].getIdFolder());
      assertEquals(expected[1].getIdDocument(), actual[1].getIdDocument());
    }
  }

  @Test
  void size() {
    assertEquals(4, archive.size());
  }
}