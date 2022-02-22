import java.util.*;

public class Branch {
    String branchName;

    ArrayList<Sale> saleList = new ArrayList<>();
    public void addSale(Sale sale) {saleList.add(sale); }


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
       return total/numSale;
    }

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

    @Override
    public String toString() {
        return "branchName='" + branchName + '\'' +
                ", saleList=" + saleList;
    }
}


