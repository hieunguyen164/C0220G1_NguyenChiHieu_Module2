package casestudy.commons;

public class Menu {
    // Display Main Menu
    public static void displayMainMenu() {
        System.out.println(
                "Main menu:\n" +
                        "1. Add New Services\n" +
                        "2. Show Services\n" +
                        "3. Add New Customer\n" +
                        "4. Show Information of Customer\n" +
                        "5. Add New Booking\n" +
                        "6. Show Information of Employee\n" +
                        "7. Booking Movie Ticket 4D\n" +
                        "8. Find Employee\n" +
                        "9. Exit");
        System.out.print("Please enter a menu number: ");
    }

    //Display Add New Services Menu
    public static void displayAddNewServicesMenu() {
        System.out.println("Add New Service Menu:\n" +
                "1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to main menu");
        System.out.print("Please enter a menu number: ");
    }

    //Display Show Services Menu
    public static void displayShowServicesMenu() {
        System.out.println("Show Services Menu:\n" +
                "1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Room Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        System.out.print("Please enter a menu number: ");
    }

    //Display Add New Booking Menu
    public static void displayAddNewBookingMenu() {
        System.out.println("Add New Booking Menu:\n" +
                "1. Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n");
        System.out.print("Please enter a menu number: ");

    }

    //Display Booking Movie Ticket 4D Menu
    public static void displayBookingMovieTicket4D(){
        System.out.println("Booking Movie Ticket 4D Menu:\n"+
                "1. Booking movie ticket\n"+
                "2. Show customer booking movie ticket\n"+
                "3. Exit");
        System.out.print("Please enter a menu number: ");
    }


}
