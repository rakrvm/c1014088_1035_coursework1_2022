// citing : https://ncl.instructure.com/courses/43687/files/5182463?module_item_id=2041579&fd_cookie_set=1
import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {
        System.out.println("Option 1: Entering Branch Data / Option 2: Entering Sale Data / Option 3: Entering Reporting Statistics / Option 4: Quit Program");
        System.out.println("Please enter the number of  the option you would like to choose:");
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected Option 1: Entering Branch Data");
                    //do something
                    break;
                case 2:
                    System.out.println("You have selected Option 2: Entering Sale Data");
                    //do something
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
                    System.out.println("Not a valid choice");
            }
        }
    }
}


