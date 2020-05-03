package casestudy.controllers;

import casestudy.commons.*;
import casestudy.models.*;
import java.util.ArrayList;

import static casestudy.commons.FuncGeneric.*;
import static casestudy.commons.Menu.*;
import static casestudy.controllers.MainController.processMain;

public class ServiceController {

    public static final String ADD_NEW_VILLA = "1";
    public static final String ADD_NEW_HOUSE = "2";
    public static final String ADD_NEW_ROOM = "3";
    public static final String BACK_TO_MAIN_MENU = "4";
    public static final String EXIT = "5";
    public static final String SHOW_ALL_VILLA = "1";
    public static final String SHOW_ALL_HOUSE = "2";
    public static final String SHOW_ALL_ROOM = "3";
    public static final String SHOW_ALL_VILLA_NOT_DUPLICATE = "4";
    public static final String SHOW_ALL_HOUSE_NOT_DUPLICATE = "5";
    public static final String SHOW_ALL_ROOM_NOT_DUPLICATE = "6";
    public static final String BACK_TO_MAIN_MENU_2 = "7";
    public static final String EXIT_2 = "8";

    private static final String ENTER_SERVICE_ID = "Enter Service ID:";
    private static final String INVALID_SERVICE_ID = "Invalid Value.\nService ID must be format SVXX-YYYY,\nY:0-9, X: case Villa is VL,case House is HO, case Room is RO.\nPlease try again!" ;
    public static final String ENTER_SERVICE_NAME = "Enter Service Name:";
    private static final String INVALID_NAME = "Invalid Value.\nName must be capitalized with first letters,the following characters is normal characters.\nPlease try again!";
    public static final String ENTER_USED_AREA = "Enter Used Area:";
    private static final String INVALID_DOUBLE_NUMBER = " Invalid Value.(Area > 30, Area must be a Double). Please try again!";
    public static final String ENTER_RENTAL_FEE = "Enter rental fee:";
    public static final String ENTER_MAXIMUM_OF_GUEST = "Enter Maximum Of Guest:";
    public static final String ENTER_TYPE_OF_RENT = "Enter Type Of Rent:";
    public static final String ENTER_ROOM_TYPE = "Enter Room Type:";
    public static final String ENTER_FACILITIIES = "Enter Facilitiies:";
    public static final String ENTER_POOL_AREA = "Enter Pool Area:";
    public static final String ENTER_NUMBER_OF_FLOOR = "Enter Number Of Floor:";
    public static final String ENTER_FREE_SERVICES = "Enter Free Services:";
    private static final String INVALID_RENTAL_FEE = "Invalid Value.(Value > 0, must be a Double). Please try again!";
    private static final String INVALID_MAX_GUEST = "Invalid Value.( 0 < Guest < 20, Guest must be an Integer). Please try again!";
    private static final String INVALID_NUMBER_OF_FLOOR = "Invalid Value.(Number of Floor must be an Integer and > 0). Please try again!";
    private static final String INVALID_FREE_SERVICE = "Free services must be: massage, food, karaoke, drink or car. Please try again!";


    //Add New Services method
    public static void addNewServices() {
        displayAddNewServicesMenu();
        processAddnewServicesMenu();
    }

    //Process Add New Services method
    public static void processAddnewServicesMenu() {
        switch (ScannerUtils.scanner.nextLine()) {
            case ADD_NEW_VILLA:
                addNewVilla();
                break;
            case ADD_NEW_HOUSE:
                addNewHouse();
                break;
            case ADD_NEW_ROOM:
                addNewRoom();
                break;
            case BACK_TO_MAIN_MENU:
                processMain();
                break;
            case EXIT:
                System.exit(0);
                break;
            default:
                System.out.println("Please select from 1 to 4");
                returnAddNewServicesMenu();
        }
    }

    //Add New Villa method
    public static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewService(villa);
        ((Villa) villa).setRoomType(FuncValidation.getValidName(ENTER_ROOM_TYPE,INVALID_NAME));
        ((Villa) villa).setFacilities(FuncValidation.getValidName(ENTER_FACILITIIES,INVALID_NAME));
        ((Villa) villa).setPoolArea(FuncValidation.getValidDoubleNumber(ENTER_POOL_AREA,INVALID_DOUBLE_NUMBER,30.0));
        ((Villa) villa).setNumberOfFloor(FuncValidation.getValidIntegerNumber(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR, 0));

        //Get villa list from CSV
        ArrayList<Villa> villaList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);

        //Add villa to list
        villaList.add((Villa) villa);

        //Write villa list to CSV
        FuncReadWriteCSV.writeVillaToFileCSV(villaList);
        System.out.println("----Villa "+villa.getNameOfService()+" added to list---- ");
        addNewServices();

    }

    //Add New House method
    public static void addNewHouse() {
        Services house = new House();
        house = addNewService(house);

        ((House) house).setRoomType(FuncValidation.getValidName(ENTER_ROOM_TYPE,INVALID_NAME));

        ((House) house).setFacilities(FuncValidation.getValidName(ENTER_FACILITIIES,INVALID_NAME));

        ((House) house).setNumberOfFloor(FuncValidation.getValidIntegerNumber(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR,0));

        //Get list house from CSV
        ArrayList<House> houseList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);

        //Add house to list
        houseList.add((House) house);

        //Write house list to CSV
        FuncReadWriteCSV.writeHouseToFileCSV(houseList);
        System.out.println("----House "+house.getNameOfService()+" added to list---- ");
        addNewServices();
    }

    //Add New Room method
    public static void addNewRoom() {
        Services room = new Room();
        room = addNewService(room);

        ((Room) room).setFreeService(FuncValidation.getValidFreeServices(ENTER_FREE_SERVICES,INVALID_FREE_SERVICE));

        //Get room list from CSV
        ArrayList<Room> roomList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);

        //Add room to list
        roomList.add((Room) room);

        //Write room list to CSV
        FuncReadWriteCSV.writeRoomToFileCSV(roomList);
        System.out.println("----Room "+room.getNameOfService()+" added to list---- ");
        addNewServices();

    }

    //Add New Service method
    public static Services addNewService(Services services) {
        services.setId(FuncValidation.getValidIdService(services,ENTER_SERVICE_ID,INVALID_SERVICE_ID));
        services.setNameOfService(FuncValidation.getValidName(ENTER_SERVICE_NAME,INVALID_NAME));
        services.setUsedArea(FuncValidation.getValidDoubleNumber(ENTER_USED_AREA, INVALID_DOUBLE_NUMBER,30.0));
        services.setRentalFee(FuncValidation.getValidDoubleNumber(ENTER_RENTAL_FEE, INVALID_RENTAL_FEE,0.0));
        services.setMaxGuest(FuncValidation.getValidIntegerNumber(ENTER_MAXIMUM_OF_GUEST,INVALID_MAX_GUEST,0,20));
        services.setRentType(FuncValidation.getValidName(ENTER_TYPE_OF_RENT,INVALID_NAME));
        return services;
    }

    //Return Add New Services Menu method
    public static void returnAddNewServicesMenu() {
        System.out.print("Please enter a number to continue:");
        processAddnewServicesMenu();
    }

    //Show Services method
    public static void showServices() {
        displayShowServicesMenu();
        processShowServiesMenu();
    }

    //Process Show Services Menu method
    public static void processShowServiesMenu(){
        switch (ScannerUtils.scanner.nextLine()){
            case SHOW_ALL_VILLA:
                showAllVilla();
                break;
            case SHOW_ALL_HOUSE:
                showAllHouse();
                break;
            case SHOW_ALL_ROOM:
                showAllRoom();
                break;
            case SHOW_ALL_VILLA_NOT_DUPLICATE:
                showAllVillaNotDuplicate();
                break;
            case SHOW_ALL_HOUSE_NOT_DUPLICATE:
                showAllHouseNotDuplicate();
                break;
            case SHOW_ALL_ROOM_NOT_DUPLICATE:
                showAllRoomNotDuplicate();
                break;
            case BACK_TO_MAIN_MENU_2:
                processMain();
                break;
            case EXIT_2:
                System.exit(0);
                break;
            default:
                System.out.println("Please select from 1 to 8");
                returnShowServicesMenu();
        }
    }

    //Show All Villa method
    public static void showAllVilla(){
        ArrayList<Villa> villaList = getListFromCSV(FuncGeneric.EntityType.VILLA);
        displayList(villaList);
        showServices();
    }

    //Show All House method
    public static void showAllHouse(){
        ArrayList<House> houseList = getListFromCSV(FuncGeneric.EntityType.HOUSE);
        displayList(houseList);
        showServices();
    }

    //Show All Room method
    public static void showAllRoom(){
        ArrayList<Room> roomList = getListFromCSV(FuncGeneric.EntityType.ROOM);
        displayList(roomList);
        showServices();
    }

    //Show All Villa Not Duplicate method
    public static void  showAllVillaNotDuplicate(){
        showAllNameNotDuplicate(FuncGeneric.EntityType.VILLA);
    }

    //Show All House Not Duplicate method
    public static void  showAllHouseNotDuplicate(){
        showAllNameNotDuplicate(FuncGeneric.EntityType.HOUSE);
    }
    //Show All Room Not Duplicate method
    public static void showAllRoomNotDuplicate(){
        showAllNameNotDuplicate(FuncGeneric.EntityType.ROOM);
    }

    //Return Show Services Menu method
    public static void returnShowServicesMenu(){
        System.out.print("Please enter a number to continue:");
        processShowServiesMenu();
    }

}
