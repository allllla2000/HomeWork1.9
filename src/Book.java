import java.util.Objects;

public class Book {
    private final String title;
    private int yearPublishing;
    private final Author author;

    public Book (String title, int yearPublishing, Author author) {
        this.title = title;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString () {
        return author + " " + title + " " + yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublishing, author);
    }
}
