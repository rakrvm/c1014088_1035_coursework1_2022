public class Sale {
    private int houseNumber;
    private String postcode;
    private double value;
    private String month;
    private int year;

    public Sale(int houseNumber, String postcode, double value, String month, int year) {
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.value = value;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return "Sale{" +
                "House Number = '" + houseNumber + '\'' +
                ", Postcode ='" + postcode + '\'' +
                ", Value ='" + value + '\'' +
                ", Date ='" + month + " " + year + '\'' +
                '}';
        }

    public double getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
