import java.util.*;

/**
 * This is a special class for representing branch object. It has
 * methods relating to branch name and array of sales.
 */

public class Branch {
    String branchName;

    ArrayList<Sale> saleList = new ArrayList<>();
    public void addSale(Sale sale) {saleList.add(sale); }

    /**
     * Constructors that wires up all the parameter values with the field variables.
     * @param branchName represents the name of the branch
     */

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    //reference: https://www.delftstack.com/howto/java/java-find-max-in-array/
    public void branchHighestValue(){
        double maxValue = 0;
        int i;
        for (i = 0; i < saleList.size(); i++) {
            if (maxValue < saleList.get(i).getValue()){
                maxValue = saleList.get(i).getValue();
            }
        }
        System.out.println("Highest value inputted for sale is: " +maxValue);
    }

    // reference : https://github.com/newcastleuniversity-computing/csc1035-csc1036_video-lecture-examples_2021
    public void branchavgSaleYear(int year){
       double total = 0;
       int numSale = 0;
       for ( Sale s : saleList) {
           if (Objects.equals(s.getYear(), year)) {
               total += s.getValue();
               numSale++;
           }
       }
        double avg111 = total/numSale;
        System.out.println(avg111);
    }

    // reference : https://stackoverflow.com/questions/26558397/how-to-find-numbers-in-an-array-that-are-greater-than-less-than-or-equal-to-a
    public void branchgreaterVal() {
        System.out.println("Enter minimum value for sales: ");
        Scanner gv = new Scanner(System.in);
        int minimum = gv.nextInt();
        int i;
        for (i = 0; i < saleList.size(); i++) {
            if (minimum < saleList.get(i).getValue()){
                System.out.printf("These are the sales greater than the minimum value of sales you asked for: ");
                System.out.println(saleList.get(i).getValue());
            }
        }
    }

    public String getBranchName() {
        return branchName;
    }

    /**
     * This returns a human-readable version of the Branch object
     * @return String representation of Branch
     */



    @Override
    public String toString() {
        return "branchName='" + branchName + '\'' +
                ", saleList=" + saleList;
    }
}


