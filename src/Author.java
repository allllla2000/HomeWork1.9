public class Author {
    private String name;
    private String lastname;

    public Author (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return lastname;
    }

}
