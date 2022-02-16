// citing : https://ncl.instructure.com/courses/43687/files/5182463?module_item_id=2041579&fd_cookie_set=1
import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Option 1: Entering Branch Data \nOption 2: Entering Sale Data \nOption 3: Entering Reporting Statistics \nOption 4: Quit Program");
            System.out.println("Please enter the number of  the option you would like to choose: ");
            int choice = s.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("You have selected Option 1: Entering Branch Data");
                    //do something
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

                    Sale sale1 = new Sale(houseNum, postcode, value, month, year);
                    System.out.println(sale1);

                    System.out.println("Data has been entered.\n");
                    break;

                case 3:
                    System.out.println("You have selected Option 3: Entering Reporting Statistics");
                    //do something
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


