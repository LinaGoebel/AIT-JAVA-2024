package homework_37.archive.dao;

import homework_37.archive.model.Documents;
import java.time.LocalDate;

public interface Archive {

  boolean addDocuments(Documents document);//добавить документ
  boolean removeDocuments(int idDocument);//удалить документ

  boolean updateDocuments(int idFolder, int idDocument, String url);//обновить документ

  Documents getDocumentsFromFolder(int idFolder,
      int idDocument);//получить документ по номеру документа и папки

  Documents[] getAllDocumentsFromArchive(int idFolder);//получить все документы из папки по ее номеру

  Documents[] getDocumentsBetweenDates(LocalDate dateFrom,
      LocalDate dateTo);//получить все документы с датами за период от и до

  int size();//узнать количество хранимых документов в архиве
  void printDocuments();
}
