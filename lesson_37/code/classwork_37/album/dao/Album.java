package classwork_37.album.dao;

import classwork_37.album.model.Photo;
import java.time.LocalDate;

public interface Album {

  boolean addPhoto(Photo photo);

  boolean removePhoto(int photoId, int albumId);

  boolean updatePhoto(int photoId, int albumId, String url);

  Photo getPhotoFromAlbum(int photoId, int albumId);

  Photo[] getAllPhotosFromAlbum(int albumId);

  Photo[] getPhotoBetweenDates(LocalDate dateFrom, LocalDate dateTo);

  int size();

}