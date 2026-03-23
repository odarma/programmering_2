package noe;

import noe.models.Album;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/album";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Skolebruker123";

    static void main(String[] args) {
        Album newAlbum = new Album("ada","abracadabra",2000);
        addAlbum(newAlbum);

        ArrayList<Album> albums = getAllAlbums();
        System.out.println(albums);
        for(Album album:albums){
            System.out.println(album);
        }

    }
    public static void addAlbum(Album album){
        try(Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD)){
            String sql = "insert into album (Title,Artist,Year) values(?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, album.getTitle());
                preparedStatement.setString(2, album.getArtist());
                preparedStatement.setInt(3, album.getYear());

                preparedStatement.executeUpdate();
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public static ArrayList<Album> getAllAlbums(){
        ArrayList<Album> allAlbums = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD)){
            //System.out.println("the connection works!");
            String sql = "select * from album;";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet resultSet = preparedStatement.executeQuery();){
                while (resultSet.next()){
                    String albumTitle = resultSet.getString("Title");
                    String albumArtist = resultSet.getString("Artist");
                    int albumYear = resultSet.getInt("Year");

                    Album fetchedAlbum = new Album(albumTitle,albumArtist,albumYear);
                    allAlbums.add(fetchedAlbum);
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
