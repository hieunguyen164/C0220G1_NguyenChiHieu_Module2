package casestudy_javacore.controllers;

import casestudy_javacore.commons.ScannerUtils;
import static casestudy_javacore.commons.Menu.displayMainMenu;
import static casestudy_javacore.controllers.BookingController.*;
import static casestudy_javacore.controllers.CustomerController.*;
import static casestudy_javacore.controllers.EmployeeController.*;
import static casestudy_javacore.controllers.ServiceController.*;

public class MainController {
    //Define Constant
    public static final String ADD_NEW_SERVICE = "1";
    public static final String SHOW_SERVICES = "2";
    public static final String ADD_NEW_CUSTOMER = "3";
    public static final String SHOW_CUSTOMER_INFORMATION = "4";
    public static final String ADD_NEW_BOOKING = "5";
    public static final String SHOW_EMPLOYEE_INFORMATION = "6";
    public static final String BOOKING_MOVIE_TICKET = "7";
    public static final String FIND_EMPLOYEE = "8";
    public static final String EXIT = "9";

    //Process Main method
    public static void processMain(){
        displayMainMenu();
        processMainMenu();
        }


    //Process Main Menu method
    public static void processMainMenu(){
        switch (ScannerUtils.scanner.nextLine()){
            case ADD_NEW_SERVICE:
                addNewServices();
                break;
            case SHOW_SERVICES:
                showServices();
                break;
            case ADD_NEW_CUSTOMER:
                addNewCustomer();
                break;
            case SHOW_CUSTOMER_INFORMATION:
                showInformationOfCustomer();
                break;
            case ADD_NEW_BOOKING:
                addNewBooking();
                break;
            case SHOW_EMPLOYEE_INFORMATION:
                showInformationOfEmployee();
                break;
            case BOOKING_MOVIE_TICKET:
                bookingMovieTicket4D();
                break;
            case FIND_EMPLOYEE:
                findEmployee();
                break;
            case EXIT:
                System.exit(0);
                break;
            default:
                System.out.println("Please select from 1 to 9");
                returnMainMenu();

        }
    }

    //Return Main Menu method
    public static void returnMainMenu(){
        System.out.print("Please enter a number to continue: ");
        processMainMenu();
    }

}
