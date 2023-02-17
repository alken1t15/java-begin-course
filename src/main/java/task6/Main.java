package task6;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Чайковский");
        Author author2 = new Author("Queen");
        Song song = new Song("Щелкунчик", author);
        Song song2 = new Song("Лебединое озеро", author);
        Song song3 = new Song("Времена года", new Author("Вивальди"));
        Song song4 = new Song("Цвет настроения синий", new Author("Киркоров"));
        Song song5 = new Song("Shape of My Heart", new Author("Sting"));
        Song song6 = new Song("Show must go on", author2);
        Song song7 = new Song("We will rock you", author2);
        Playlist playlist = new Playlist();
        playlist.addSong(song);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);
        playlist.playAllSongs();
    }
}