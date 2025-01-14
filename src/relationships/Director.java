package relationships;

public class Director {
    // private instance variables for a Director object
    private String name;
    private String surname;
    private int noOfMovies; // number of movies
    private Date dOB; // date of birth

    // a constructor to create a Director object using the name and the surname
    public Director (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // getters for each attribute
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDOB() {
        return dOB;
    }

    public int getNoOfMovies() {
        return noOfMovies;
    }

    // setters for date of birth and number of movies
    public void setDOB(Date dOB) {
        this.dOB = dOB;
    }

    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }

    // overriding toString() method in Object class to print custom message
    @Override
    public String toString() {
        return "Director [ name = " + name + ", surname = " + surname + ", dob = " + dOB.getDate() + ", movies directed = " + noOfMovies + " ]";
    }
}
