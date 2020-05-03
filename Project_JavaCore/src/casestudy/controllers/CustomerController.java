package casestudy.controllers;

import casestudy.commons.FuncGeneric;
import casestudy.commons.FuncReadWriteCSV;
import casestudy.commons.FuncValidation;
import casestudy.commons.ScannerUtils;
import casestudy.models.Customer;
import casestudy.models.SortNameAndYear;

import java.util.ArrayList;

import static casestudy.commons.FuncGeneric.displayList;
import static casestudy.controllers.MainController.processMain;


public class CustomerController {
    public static final String ENTER_CUSTOMER_NAME = "Enter Customer Name: ";
    public static final String INVALID_CUSTOMER_NAME = "Invalid Value.\nName must be capitalized with first letters,the following characters is normal characters.\nPlease try again!";
    public static final String ENTER_BIRTHDAY = "Enter Birthday: ";
    public static final String INVALID_BIRTHDAY = "Invalid Value. Birthday must be format dd/MM/yyyy, year > 1990 and 18 years less than the current day.\nPlease try again!";
    public static final String ENTER_GENDER = "Enter Gender: ";
    public static final String INVALID_GENDER = "Invalid Value. Gender must be: Male/Female/Unknown.\nPlease try again!";
    public static final String ENTER_ID_NUMBER = "Enter ID Number: ";
    public static final String INVALID_ID_NUMBER = "Invalid Value. ID Number must be 9 digits and has format XXX XXX XXX.\nPlease try again!";
    public static final String ENTER_EMAIL = "Enter Email: ";
    public static final String INVALID_EMAIL = "Invalid value.Email must be format 'abc@abc.abc'. Please try again!";

    //Add New Customer method
    public static void addNewCustomer() {
        Customer customer = new Customer();
        customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME, INVALID_CUSTOMER_NAME));
        customer.setBirthday(FuncValidation.getValidBirthDay(ENTER_BIRTHDAY, INVALID_BIRTHDAY));
        customer.setGender(FuncValidation.getValidGender(ENTER_GENDER, INVALID_GENDER));
        customer.setIdNumber(FuncValidation.getValidIdNumber(ENTER_ID_NUMBER, INVALID_ID_NUMBER));
        System.out.println("Enter Phone Number:");
        customer.setPhoneNumber(ScannerUtils.scanner.nextLine());
        customer.setEmail(FuncValidation.getValidEmail(ENTER_EMAIL, INVALID_EMAIL));
        System.out.println("Enter Customer Type:");
        customer.setCustomerType(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Address:");
        customer.setAddress(ScannerUtils.scanner.nextLine());

        //Get list customer from CSV
        ArrayList<Customer> customersList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);

        //Add customer to list
        customersList.add(customer);

        //Write customer list to CSV
        FuncReadWriteCSV.writeCustomerToFileCSV(customersList);
        System.out.println("----Customer " + customer.getFullName() + " added to list---- ");
        processMain();
    }

    //Show Information of Customer method
    public static void showInformationOfCustomer() {
        ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
        customerList.sort(new SortNameAndYear());
        displayList(customerList);
        processMain();

    }
}
