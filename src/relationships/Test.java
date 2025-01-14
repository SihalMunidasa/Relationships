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

        // Test Movie's	constructor	and	toString()
        Movie movie	= new Movie("Avatar", "Fantasy", director);
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
    }
}