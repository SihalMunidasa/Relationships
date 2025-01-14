package relationships;

public class Movie {
    // private instance variables/attributes for Movie class
    private String title;
    private String category;
    private Director director;
    private int numAward;
    private Actor[] actors;

    // Movie constructor
    public Movie (String title, String category, Director director, Actor[] actors) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.actors = actors;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public int getNumAward() {
        return numAward;
    }

    public Actor[] getActors() {
        return actors;
    }

    // setters
    public void setNumAward(int numAward) {
        this.numAward = numAward;
    }

    // overriding the toString() method in Object class to print custom message
    @Override
    public String toString() {
        return "Movie [ title = " + title + ", category = " + category + ", director name = " + director.getName() + ", director surname = " + director.getSurname() + ", number of awards = " + numAward + " ]";
    }
}
