/**
 * This is a special class for representing sales object. It has
 * methods relating to sales and some of its attributes like value and so on.
 */

public class Sale {
    private int houseNumber;
    private String postcode;
    private double value;
    private String month;
    private int year;

    /**
     * Constructors that wires up all the parameter values with the field variables.
     * @param houseNumber represents the number of the house sold
     * @param postcode represents the postcode of the house sold
     * @param value represents the value of the house sold
     * @param month represents the month of the house sold
     * @param year represents the year of the house sold
     */

    public Sale(int houseNumber, String postcode, double value, String month, int year) {
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.value = value;
        this.month = month;
        this.year = year;
    }

    /**
     * This returns a human-readable version of the Sales object
     * @return String representation of Sales
     */

    public String toString(){
        return "Sale{" +
                "House Number = '" + houseNumber + '\'' +
                ", Postcode ='" + postcode + '\'' +
                ", Value ='" + value + '\'' +
                ", Date ='" + month + " " + year + '\'' +
                '}';
        }

    /**
     * This is a getter used to get values of sales to use with branches later on.
     */

    public double getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
