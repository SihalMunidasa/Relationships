package relationships;

public class Actor {
    // private instance variables for a Actor object
    private String name;
    private String surname;

    // a default constructor
    public Actor() {

    }

    // a constructor to create a Director object using the name and the surname
    public Actor (String name, String surname) {
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

    // setters for each attribute
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // overriding toString() method in Object class to print custom message
    @Override
    public String toString() {
        return "Actor [ name = " + name + ", surname = " + surname + " ]";
    }
}
