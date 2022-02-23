public class Testing {

    public static void main(String[] args) {
        Reporting testingReport = new Reporting();

        /**
         * Stores the branch names into the array (hardcoded)
         */

        testingReport.addBranch(new Branch("Denton Burn"));
        testingReport.addBranch(new Branch("Fenham"));
        testingReport.addBranch(new Branch("City Centre"));

        /**
         * Stores the sale data into the array (hardcoded)
         */

        testingReport.branchList.get(0).addSale(new Sale(11, "NE117AQ", 200.00, "January", 2003));
        testingReport.branchList.get(1).addSale(new Sale(12, "NE127AQ", 3000, "February", 2004));
        testingReport.branchList.get(2).addSale(new Sale(13, "NE137AQ", 400.100, "March", 2005));
        testingReport.branchList.get(0).addSale(new Sale(14, "NE147AQ", 500.00, "April", 2011));
        testingReport.branchList.get(1).addSale(new Sale(15, "NE157AQ", 6000, "May", 2007));
        testingReport.branchList.get(2).addSale(new Sale(16, "NE167AQ", 7000, "June", 2003200));
        testingReport.branchList.get(0).addSale(new Sale(17, "NE177AQ", 800.00, "July", 2009));
        testingReport.branchList.get(1).addSale(new Sale(18, "NE187AQ", 9000, "August", 2004));


        testingReport.reportAvgSaleYear(2003);


        /**
         * Tests the method to return the highest value of each branch
         */

        //testingReport.branchList.get(0).branchHighestValue();
        //testingReport.branchList.get(1).branchHighestValue();
        //testingReport.branchList.get(2).branchHighestValue();

        /**
         * Tests the method to return values higher than inputted value for each branch
         */

        //testingReport.branchList.get(0).branchgreaterVal();
        //testingReport.branchList.get(1).branchgreaterVal();
        //testingReport.branchList.get(2).branchgreaterVal();

        /**
         * Tests the method to return the average value of the sales in a given year (hardcoded)
         */

        //testingReport.branchList.get(0).branchavgSaleYear(2003);
        //testingReport.branchList.get(1).branchavgSaleYear(2004);

        /**
         * Tests the method to return the highest value of all branches
         * and the method to return values higher than inputted value for all branches
         */

        //testingReport.reportHighestValue();
        //testingReport.reportgreaterVal();

    }
}



    // Scanner yc = new Scanner(System.in);
   // int yearChoice = yc.nextInt();

                               // System.out.println("Select index of branch you want to add data to (1st option = 0 / 2nd option = 1 etc.): ");
                                     //   System.out.println(mainReport);
                                       // Scanner branchSelect1 = new Scanner(System.in);
                                    //    int branchChoice1 = branchSelect1.nextInt();

        //                                mainReport.branchList.get(branchChoice1).branchavgSaleYear(yearChoice);
//
     //