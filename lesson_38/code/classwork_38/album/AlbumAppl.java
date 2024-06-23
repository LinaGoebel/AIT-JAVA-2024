package classwork_38.album;

import classwork_38.album.dao.AlbumImpl;

public class AlbumAppl {

  public static void main(String[] args) {
    AlbumImpl album = new AlbumImpl(1000);

    System.out.println(album.size());
  }

}
