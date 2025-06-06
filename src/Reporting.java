import java.util.*;

public class Reporting {
    public ArrayList<Branch> branchList = new ArrayList<>();

    public void addBranch(Branch branch) {
        branchList.add(branch);
    }


    // reference: https://www.delftstack.com/howto/java/java-find-max-in-array/
    public void reportHighestValue() {
        double maxValue = 0;
        int i;
        int o;
        for (i = 0; i < branchList.size(); i++) {
            for (o = 0; o < branchList.get(i).saleList.size(); o++) {
                if (maxValue < branchList.get(i).saleList.get(o).getValue()) {
                    maxValue = branchList.get(i).saleList.get(o).getValue();
                }
            }
        }
        System.out.println("Highest value inputted for sale is: " + maxValue);
    }


    // reference: // reference : https://stackoverflow.com/questions/26558397/how-to-find-numbers-in-an-array-that-are-greater-than-less-than-or-equal-to-a
    public void reportgreaterVal() {
        System.out.println("Enter minimum value for sales: ");
        Scanner gv = new Scanner(System.in);
        int minimum = gv.nextInt();
        int i;
        int o;
        for (i = 0; i < branchList.size(); i++) {
            for (o = 0; o < branchList.get(i).saleList.size(); o++) {
                if (minimum < branchList.get(i).saleList.get(o).getValue()) {
                    System.out.printf("These are the sales greater than the minimum value of sales you asked for: ");
                    System.out.println(branchList.get(i).saleList.get(o).getValue());
                }
            }
        }
    }

    public void reportAvgSaleYear(int year) {

        String tempbranchName = "";
        double total = 0;
        double reportAvg = 0;
        int numSale = 0;
        int i;

        for (i = 0; i < branchList.size(); i++) {

            for (Sale s : branchList.get(i).saleList) {
                if (Objects.equals(s.getYear(), year)) {
                    total += s.getValue();
                    numSale++;
                }
            }
            double tempreportAvg = total / numSale;
            total = 0;

            if (tempreportAvg > reportAvg) ;{
                reportAvg = tempreportAvg;
                tempbranchName = branchList.get(i).getBranchName();
            }
        }
        System.out.println("The branch with the highest average: " + tempbranchName);
    }


        /**
         * This returns a human-readable version of the Reporting object
         * @return String representation of Reporting
         */

        @Override
        public String toString() {
            return "branchList=" + branchList;
        }
    }