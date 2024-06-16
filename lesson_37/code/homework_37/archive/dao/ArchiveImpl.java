package homework_37.archive.dao;

import homework_37.archive.model.Documents;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


public class ArchiveImpl implements Archive {

  private Documents[] documents;
  private int size;

  public ArchiveImpl(int capacity) {
    this.documents = new Documents[capacity];
    this.size = 0;  // Initialize size to 0
  }

  static Comparator<Documents> comparator = (p1, p2) -> {
    int res = p1.getDate().compareTo(p2.getDate());
    return res != 0 ? res : Integer.compare(p1.getIdDocument(), p2.getIdDocument());
  };

  @Override
  public boolean addDocuments(Documents document) {
    if (document == null || size == documents.length ||
        getDocumentsFromFolder(document.getIdDocument(), document.getIdFolder()) != null) {
      return false;
    }
    int index = Arrays.binarySearch(documents, 0, size, document, comparator);
    index = index >= 0 ? index : -index - 1;
    System.arraycopy(documents, index, documents, index + 1, size - index);
    documents[index] = document;
    size++;

    return true;
  }

  @Override
  public boolean removeDocuments(int idDocument) {
    if (idDocument < 0 || idDocument >= size) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (documents[i].getIdDocument() == idDocument) {
        documents[i] = documents[size - 1];
        documents[size - 1] = null;
        size--;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean updateDocuments(int idFolder, int idDocument, String url) {
    for (Documents doc : documents) {
      if (doc != null && doc.getIdFolder() == idFolder && doc.getIdDocument() == idDocument) {
        if (doc.getUrl().equals(url)) {
          return false;
        }
        doc.setUrl(url);
        return true;
      }
    }
    return false;
  }

  @Override
  public Documents getDocumentsFromFolder(int idFolder, int idDocument) {
    for (int i = 0; i < size; i++) {
      if (documents[i].getIdFolder() == idFolder && documents[i].getIdDocument() == idDocument) {
        return documents[i];
      }
    }
    return null;
  }


  @Override
  public Documents[] getAllDocumentsFromArchive(int idFolder) {
    ArrayList<Documents> result = new ArrayList<>();
    for (Documents doc : documents) {
      if (doc != null && doc.getIdFolder() == idFolder) {
        result.add(doc);
      }
    }
    return result.toArray(new Documents[0]);
  }
  static Comparator<Documents> comparator1 = (b1, b2) -> {
    int res = b1.getIdFolder() - b2.getIdFolder();
    return res != 0 ? res : Integer.compare(b1.getIdDocument(), b2.getIdDocument());
  };
  @Override
  public Documents[] getDocumentsBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
    ArrayList<Documents> result = new ArrayList<>();
    for (Documents doc : documents) {
      if (doc != null && doc.getDate() != null) {
        LocalDate docDate = doc.getDate().toLocalDate();
        if (!docDate.isBefore(dateFrom) && !docDate.isAfter(dateTo)) {
          result.add(doc);
        }
      }
    }
    result.sort(comparator1);
    Documents[] resultArray = result.toArray(new Documents[result.size()]);

    return resultArray;

  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void printDocuments() {
    for (Documents documents : documents) {
      System.out.println(documents);
    }
  }
}