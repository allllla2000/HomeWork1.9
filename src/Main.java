public class Main {

    public static void main(String[] args) {
        Author vladimirSorokin = new Author("Vladimir", "Sorokin");
        Author georgeOrwell = new Author("George", "Orwell");

        Book norma = new Book("Norma", 1984, vladimirSorokin);
        Book animalFarm = new Book("Animal Farm", 1945, georgeOrwell);

        norma.setYearPublishing(1990);
        animalFarm.setYearPublishing(1950);




    }

}
