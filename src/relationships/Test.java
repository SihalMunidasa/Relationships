package relationships;

/*
 * A test program for the Movie	class.
 */
public class Test {
    public static void main(String[] args) {

        // We need a Director instance to create a Movie instance
        Director director =	new	Director("James",	"Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDOB(dob);
        director.setNoOfMovies(23);
        System.out.println(director); // Director's	toString()

        // Creating actors list of a movie
        Actor[] listActor = new Actor[10]; // it will create an array of 10 actors
        listActor[0] = new Actor(); // it will create an object Actor and save in position 0
        listActor[0].setName("Jackie");
        listActor[0].setSurname("Chan");

        // Test Movie's	constructor	and	toString()
        Movie movie	= new Movie("Avatar", "Fantasy", director, listActor);
        System.out.println(movie); // Movie's toString()
        // Here when we print out the movie, the number of awards is mentioned as 0
        // but we never initialised the numAwards variable
        // It is because when an instance is created of an object that includes an attribute with
        // data type int, it sets it's value to 0 by default
        // However, this is not the case for local variables (the ones in methods)

        // Test Setters and Getters
        movie.setNumAward(23);
        System.out.println(movie); // Movie's toString()
        System.out.println("title is: "	+ movie.getTitle());
        System.out.println("category is: " + movie.getCategory());
        System.out.println("name of	director is: " + movie.getDirector().getName());
        System.out.println("surname	of director is: " + movie.getDirector().getSurname());
        System.out.println("number of awards is: " + movie.getNumAward());

        // Printing all the actors in the movie
        for (Actor actor: movie.getActors()) {
            System.out.println(actor);
        }
    }
}