package classwork_37.album.dao;

import classwork_37.album.model.Photo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album {

  //fields
  private Photo[] photos;
  private int size;

  public AlbumImpl(int capacity) {
    this.photos = new Photo[capacity];
    this.size = 0;
  }

  static Comparator<Photo> comparator = (p1, p2) -> {
    int res = p1.getDate().compareTo(p2.getDate());
    return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
  };

  @Override
  public boolean addPhoto(Photo photo) {
    // bad cases
    if (photo == null || size == photos.length
        || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
      return false;
    }
    // find index to insert
    int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
    // index treatment
    index = index >= 0 ? index : -index - 1;
    // shift array from index right on 1 position
    System.arraycopy(photos, index, photos, index + 1, size - index);
    photos[index] = photo;
    size++;
    return true;
  }

  @Override
  public boolean removePhoto(int photoId, int albumId) {
    if (photoId < 0 || photoId >= size) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
        photos[i] = photos[size - 1];
        photos[size - 1] = null;
        size--;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean updatePhoto(int photoId, int albumId, String url) {
    for (Photo photo : photos) {
      if (photo != null && photo.getPhotoId() == photoId && photo.getAlbumId() == albumId) {
        if (photo.getUrl().equals(url)) {
          return false;
        }
        photo.setUrl(url);
        return true;
      }
    }
    return false;
  }

  @Override
  public Photo getPhotoFromAlbum(int photoId, int albumId) {
    for (int i = 0; i < size; i++) {
      if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
        return photos[i];
      }
    }
    return null;
  }

  @Override
  public Photo[] getAllPhotosFromAlbum(int albumId) {
    ArrayList<Photo> result = new ArrayList<>();
    for (Photo photo : photos) {
      if (photo != null && photo.getAlbumId() == albumId) {
        result.add(photo);
      }
    }
    return result.toArray(new Photo[0]);
  }

  @Override
  public Photo[] getPhotoBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
    ArrayList<Photo> result = new ArrayList<>();
    for (Photo photo : photos) {
      if (photo != null && photo.getDate() != null) {
        LocalDate photoDate = photo.getDate().toLocalDate();
        if (!photoDate.isBefore(dateFrom) && !photoDate.isAfter(dateTo)) {
          result.add(photo);
        }
      }
    }
    result.sort(comparator);
    Photo[] resultArray = result.toArray(new Photo[result.size()]);
    return resultArray;
  }

  @Override
  public int size() {
    return size;
  }

}