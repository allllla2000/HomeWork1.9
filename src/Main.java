public class Main {

    public static void main(String[] args) {
        Author vladimirSorokin = new Author("Vladimir", "Sorokin");
        Author georgeOrwell = new Author("George", "Orwell");

        Book norma = new Book("Norma", 1984, vladimirSorokin);
        Book animalFarm = new Book("Animal Farm", 1945, georgeOrwell);

        norma.setYearPublishing(1990);
        animalFarm.setYearPublishing(1950);

        System.out.println(vladimirSorokin.toString());
        System.out.println(georgeOrwell.toString());

        System.out.println(norma.toString());
        System.out.println(animalFarm.toString());

        System.out.println(norma.hashCode());
        System.out.println(vladimirSorokin.hashCode());
        System.out.println(georgeOrwell.hashCode());
        System.out.println(animalFarm.hashCode());

        System.out.println(norma.equals(animalFarm));
        System.out.println(norma.equals(georgeOrwell));
        System.out.println(georgeOrwell.equals(vladimirSorokin));




    }

}
