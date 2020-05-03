package casestudy.commons;

import casestudy.models.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncReadWriteCSV {


    //CSV path
    public static final String pathVilla = "src/casestudy/data/villa.csv";
    public static final String pathHouse = "src/casestudy/data/house.csv";
    public static final String pathRoom = "src/casestudy/data/room.csv";
    public static final String pathCustomer = "src/casestudy/data/customer.csv";
    public static final String pathEmployee = "src/casestudy/data/employee.csv";
    public static final String pathBooking = "src/casestudy/data/booking.csv";

    //CSV header
    public static String[] headerRecordVilla = new String[]
            {"id", "nameOfService", "usedArea", "rentalFee", "maxGuest", "rentType",
                    "roomType", "facilities", "poolArea", "numberOfFloor"};
    public static String[] headerRecordHouse = new String[]
            {"id", "nameOfService", "usedArea", "rentalFee", "maxGuest", "rentType",
                    "roomType", "facilities", "numberOfFloor"};
    public static String[] headerRecordRoom = new String[]
            {"id", "nameOfService", "usedArea", "rentalFee", "maxGuest", "rentType",
                    "freeService"};
    public static String[] headerRecordCustomer = new String[]
            {"fullname","birthday","gender","idNumber","phoneNumber","email","customerType","address"};
    public static String[] headerRecordEmployee = new String[]
            {"id","fullName","age","address"};
    public static String[] headerRecordBooking = new String[]
            {"fullname","birthday","gender","idNumber","phoneNumber","email","customerType","address",
            "idService","nameOfServie","usedArea","retalFee","maxGuest","rentType"};

    //Write list villa to CSV method
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]
                        {villa.getId(), villa.getNameOfService(), String.valueOf(villa.getUsedArea()), String.valueOf(villa.getRentalFee()),
                                String.valueOf(villa.getMaxGuest()), villa.getRentType(), villa.getRoomType(), villa.getFacilities(),
                                String.valueOf(villa.getPoolArea()), String.valueOf(villa.getNumberOfFloor())});

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Write list house to CSV method
    public static void writeHouseToFileCSV(ArrayList<House> arrayList){
        try(Writer writer = new FileWriter(pathHouse);
        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordHouse);
            for(House house:arrayList){
                csvWriter.writeNext(new String[]
                        {house.getId(),house.getNameOfService(),String.valueOf(house.getUsedArea()),String.valueOf(house.getRentalFee()),
                                String.valueOf(house.getMaxGuest()),house.getRentType(),house.getRoomType(),house.getFacilities(),
                                        String.valueOf(house.getNumberOfFloor())});
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Write list room to CSV method
    public static void writeRoomToFileCSV(ArrayList<Room> arrayList){
        try(Writer writer = new FileWriter(pathRoom);
        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordRoom);
            for(Room room:arrayList){
                csvWriter.writeNext(new String[]
                        {room.getId(),room.getNameOfService(),String.valueOf(room.getUsedArea()),String.valueOf(room.getRentalFee()),
                        String.valueOf(room.getMaxGuest()),room.getRentType(),room.getFreeService()});
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Write customer list to CSV method
    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathCustomer);
        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordCustomer);
            for(Customer customer: arrayList){
                csvWriter.writeNext(new String[]
                        {customer.getFullName(),customer.getBirthday(),customer.getGender(),customer.getIdNumber(),
                        customer.getPhoneNumber(),customer.getEmail(),customer.getCustomerType(),customer.getAddress()});
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Get booking list from CSV
    public static ArrayList<Customer> getBookingFromCsv(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try (Reader reader = new FileReader(pathBooking);
             CSVReader csvReader = new CSVReader(reader);
             ){
            String[] line;
            csvReader.skip(1);
            while ((line = csvReader.readNext()) != null){
                Customer customer = new Customer();
                Villa villa = new Villa();
                int pos = 0;
                customer.setFullName(line[pos++]);
                customer.setBirthday(line[pos++]);
                customer.setGender(line[pos++]);
                customer.setIdNumber(line[pos++]);
                customer.setPhoneNumber(line[pos++]);
                customer.setEmail(line[pos++]);
                customer.setCustomerType(line[pos++]);
                customer.setAddress(line[pos++]);

                villa.setId(line[pos++]);
                villa.setNameOfService(line[pos++]);
                villa.setUsedArea(Double.parseDouble(line[pos++]));
                villa.setRentalFee(Double.parseDouble(line[pos++]));
                villa.setMaxGuest(Integer.parseInt(line[pos++]));
                villa.setRentType(line[pos++]);
                customer.setServices(villa);
                listCustomer.add(customer);

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return listCustomer;
    }

    //Write Booking to  CSV
    public static void writeBookingToFileCsv(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathBooking);
        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordBooking);
            for(Customer customer:arrayList){
                csvWriter.writeNext(new String[]{
                        customer.getFullName(), customer.getBirthday(), customer.getGender(), customer.getIdNumber(),
                        customer.getPhoneNumber(), customer.getEmail(), customer.getCustomerType(), customer.getAddress(),
                        customer.getServices().getId(), customer.getServices().getNameOfService(), String.valueOf(customer.getServices().getUsedArea()),
                        String.valueOf(customer.getServices().getRentalFee()), String.valueOf(customer.getServices().getMaxGuest()),
                        customer.getServices().getRentType()
                });
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Get All Name Service From CSV
    public static TreeSet<String> getAllNameServicesFromCsv(String path){
        BufferedReader br = null;
        TreeSet<String> result = new TreeSet<>();
        try{
            String line;
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine())!= null){
                if(getNameServicesFromFile(line).equals("nameOfService")){
                    continue;
                }
                result.add(getNameServicesFromFile(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br!=null){
                    br.close();
                }
            }catch (IOException crunchifyExcetion){
                crunchifyExcetion.printStackTrace();
            }
        }
        result.descendingSet();
        return result;
    }

    //Get Name Servies From File Method
    public static String getNameServicesFromFile(String csvLine){
        String name = "";
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }
}
