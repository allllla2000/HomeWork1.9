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

}
