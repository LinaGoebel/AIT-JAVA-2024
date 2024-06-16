package homework_37.archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

//id папки
//id документа
//название документа
//url
//дата документа
public class Documents implements Comparable<Documents> {

  private int idFolder;
  private int idDocument;
  private String name;
  private String url;
  private LocalDateTime date;

  public Documents(int idFolder, int idDocument, String name, String url, LocalDateTime date) {
    this.idFolder = idFolder;
    this.idDocument = idDocument;
    this.name = name;
    this.url = url;
    this.date = date;

  }


  public int getIdFolder() {
    return idFolder;
  }

  public int getIdDocument() {
    return idDocument;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Documents documents = (Documents) o;
    return idFolder == documents.idFolder &&
        idDocument == documents.idDocument &&
        Objects.equals(name, documents.name) &&
        Objects.equals(url, documents.url) &&
        Objects.equals(date, documents.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idFolder, idDocument, name, url, date);
  }
  @Override
  public String toString() {
    return "Documents{" +
        "idFolder=" + idFolder +
        ", idDocument=" + idDocument +
        ", name='" + name + '\'' +
        ", url='" + url + '\'' +
        ", date=" + date +
        '}';
  }


  @Override
  public int compareTo(Documents o) {
    int res = Integer.compare(idFolder, o.idFolder);
    return res = res != 0 ? res : Integer.compare(idDocument, o.idDocument);
  }
}
