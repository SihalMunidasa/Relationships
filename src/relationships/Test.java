package relationships;

/*
 * A test class for the Director class.
 */
public class Test {
    public static void main(String[] args) {
        // Test constructor
        Director director = new Director("James", "Cameron");

        // Test Setters and Getters

        // Crete an object Date to represent the dob
        Date dob = new Date(16, 8, 1954);
        director.setDOB(dob);
        director.setNoOfMovies(23);
        System.out.println(director);  // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDOB().getDate());
        System.out.println("number of directed movies is: " + director.getNoOfMovies());
    }
}