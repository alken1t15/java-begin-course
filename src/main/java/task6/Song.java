package task6;

public class Song implements ISong {
    private String name;

    private Author author;

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Song() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Author getAuthor() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void play() {
        System.out.printf("Играет песня %s, автор %s\n", name, author.getName());
    }
}