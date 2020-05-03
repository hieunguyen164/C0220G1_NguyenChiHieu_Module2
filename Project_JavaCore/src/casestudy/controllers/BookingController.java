package casestudy.controllers;

import casestudy.commons.FuncGeneric;
import casestudy.commons.FuncReadWriteCSV;
import casestudy.commons.ScannerUtils;
import casestudy.models.Customer;
import casestudy.models.House;
import casestudy.models.Room;
import casestudy.models.Villa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static casestudy.commons.FuncGeneric.displayList;
import static casestudy.commons.Menu.displayAddNewBookingMenu;
import static casestudy.commons.Menu.displayBookingMovieTicket4D;
import static casestudy.controllers.MainController.processMain;

public class BookingController {

    private static Queue<Customer> customerQueueBookingTicket = new LinkedList<Customer>();

    public static final String BOOKING_VILLA = "1";
    public static final String BOOKING_HOUSE = "2";
    public static final String BOOKING_ROOM = "3";
    public static final String ADD_BOOKING_MOVIE = "1";
    public static final String SHOW_BOOKING_MOVIE = "2";
    public static final String EXIT = "3";

    //Add New Booking method
    public static void addNewBooking() {
        ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
        displayList(customerList);
        System.out.println("---Choose one Customer to Booking:");
        Customer customer = customerList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
        displayAddNewBookingMenu();
        processBookingMenu(customer);

        //Get customer list from CSV
        ArrayList<Customer> listBooking = FuncReadWriteCSV.getBookingFromCsv();

        //Add customer to list
        listBooking.add(customer);

        //Write customer list to CSV
        FuncReadWriteCSV.writeBookingToFileCsv(listBooking);
        System.out.println("-----Added booking for: " + customer.getFullName());
    }

    //Booking Move
    public static void bookingMovieTicket4D() {
        displayBookingMovieTicket4D();
        processBookingMovieTicket4D();
    }

    //Process Booking Menu Method
    public static void processBookingMenu(Customer customer) {
        switch (ScannerUtils.scanner.nextLine()) {
            case BOOKING_VILLA:
                ArrayList<Villa> villaList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);
                displayList(villaList);
                System.out.println("---Choose Villa Booking:");
                Villa villa = villaList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(villa);
                break;
            case BOOKING_HOUSE:
                ArrayList<House> houseList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);
                displayList(houseList);
                System.out.println("---Choose House Booking");
                House house = houseList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(house);
                break;
            case BOOKING_ROOM:
                ArrayList<Room> roomList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);
                displayList(roomList);
                System.out.println("---Choose Room Booking:");
                Room room = roomList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(room);
                break;
            default:
                processMain();

        }
    }

    //Process Booking Movie Ticket 4D method
    public static void processBookingMovieTicket4D(){
        switch (ScannerUtils.scanner.nextLine()){
            case ADD_BOOKING_MOVIE:
                addBookingMovieTicket4D();
                break;
            case SHOW_BOOKING_MOVIE:
                showBookingMovieTicket4D();
            case EXIT:
                System.exit(0);
                break;
            default:
                System.out.println("Error! Return to main menu.");
                processMain();
        }
    }

    //Add Booking Movie Ticket method
    private static void addBookingMovieTicket4D(){
        try{
            ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
            displayList(customerList);
            System.out.println("---Select customer want to booking:");
            Customer customer = customerList.get(Integer.parseInt(ScannerUtils.scanner.nextLine())-1);
            customerQueueBookingTicket.add(customer);
            System.out.println("---Added booking for: "+customer.getFullName());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Customer not exists! Try again.");
            addBookingMovieTicket4D();
        }
        processMain();
    }


    //Show Booking Movie Ticket 4D method
    private static void showBookingMovieTicket4D(){
        int i = 1;
        System.out.println("--------------LIST--------------");
        for(Customer customer:customerQueueBookingTicket){
            System.out.println("NO: "+i);
            customer.showInfor();
            i++;
            System.out.println("---------------END----------------");
        }
        processMain();
    }
}
