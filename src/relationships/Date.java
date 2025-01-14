package relationships;

public class Date {
    // private instance variables/attributes of a Date object
    private int day;
    private int month;
    private int year;

    // relationships.Date constructor to create Date object
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // setter for each attribute
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // getter for each attribute
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // setter and getter for all the attributes at once
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    // overriding toString() method in Object class to print a custom message
    @Override
    public String toString() {
        return "relationships.Date [ day = " + day + ", month = " + month + ", year = " + year + " ]";
    }
}
