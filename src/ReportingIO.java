// reference : https://ncl.instructure.com/courses/43687/files/5182463?module_item_id=2041579&fd_cookie_set=1

import java.util.*;


public class ReportingIO {

    public static void main(String[] args) {
        Reporting mainReport = new Reporting();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Option 1: Entering Branch Data \nOption 2: Entering Sale Data \nOption 3: Entering Reporting Statistics \nOption 4: Quit Program");
            System.out.println("Please enter the number of  the option you would like to choose: ");
            int choice = s.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("You have selected Option 1: Entering Branch Data");

                    System.out.println("Enter branch names: ");

                    Scanner scbranchName = new Scanner(System.in);
                    String branchName = scbranchName.nextLine();
                    mainReport.addBranch(new Branch(branchName));
                    System.out.println(mainReport);
                    break;

                case 2:
                    System.out.println("You have selected Option 2: Entering Sale Data");

                    Scanner schouseNum = new Scanner(System.in);
                    System.out.println("Input house number: ");
                    int houseNum = schouseNum.nextInt();

                    Scanner scpostcode = new Scanner(System.in);
                    System.out.println("Input postcode: ");
                    String postcode = scpostcode.nextLine();

                    Scanner scvalue = new Scanner(System.in);
                    System.out.println("Input value: ");
                    double value = scvalue.nextDouble();

                    Scanner scmonth = new Scanner(System.in);
                    System.out.println("Input month: ");
                    String month = scmonth.nextLine();

                    Scanner scyear = new Scanner(System.in);
                    System.out.println("Input year: ");
                    int year = scyear.nextInt();

                    System.out.println("Select index of branch you want to add data to (1st option = 0 / 2nd option = 1 etc.): ");
                    System.out.println(mainReport);
                    Scanner branchSelect = new Scanner(System.in);
                    int branchChoice = branchSelect.nextInt();

                    System.out.println("Data has been entered.\n");

                    mainReport.branchList.get(branchChoice).addSale(new Sale(houseNum, postcode, value, month, year));
                    System.out.println(mainReport);


                    System.out.println("Data has been entered.\n");
                    break;

                case 3:
                    System.out.println("You have selected Option 3: Entering Reporting Statistics");
                    Scanner s1 = new Scanner(System.in);
                    boolean quit1 = false;
                    while (!quit1) {
                        System.out.println("Option 1: Search for branch  with  largest  average  value sale  for a given year \nOption 2: Search for highest sale ever reported \nOption 3: Search for all sales with value greater than a given amount \nOption 4: Return to menu");
                        int choice1 = s1.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("You have selected Option 1: Search for branch  with  largest  average  value sale  for a given year");

                                Scanner yc = new Scanner(System.in);
                                int yearChoice = yc.nextInt();

                                System.out.println("Select index of branch you want to add data to (1st option = 0 / 2nd option = 1 etc.): ");
                                System.out.println(mainReport);
                                Scanner branchSelect1 = new Scanner(System.in);
                                int branchChoice1 = branchSelect1.nextInt();

                                mainReport.branchList.get(branchChoice1).branchavgSaleYear(yearChoice);

                                break;

                            case 2:
                                System.out.println("You have selected Option 2: Search for highest sale ever reported");
                                mainReport.reportHighestValue();
                                break;

                            case 3:
                                System.out.println("You have selected Option 3: Search for all sales with value greater than a given amount");
                                //do something
                                break;

                            case 4:
                                System.out.println("You have selected Option 4: Return to menu");
                                System.out.println("Returning to main menu...");
                                quit1 = true;
                                break;
                            default:
                                System.out.println("Not a valid choice");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("You have selected Option 4: Quit Program");
                    System.out.println("Quitting program...");
                    quit = true;
                    break;

                default:
                    System.out.println("Not a valid option");
            }
        }
    }
}


