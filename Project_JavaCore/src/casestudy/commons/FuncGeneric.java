package casestudy.commons;

import casestudy.models.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

import static casestudy.commons.FuncReadWriteCSV.*;
import static casestudy.controllers.MainController.processMain;


public class FuncGeneric {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SKIP = 1;
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM,
        CUSTOMER,
        EMPLOYEE
    }

    //Get list From CSV method
    public static <E> ArrayList<E> getListFromCSV(EntityType entityType) {
        String csvPath = "";
        String[] headRecord;
        switch (entityType) {
            case VILLA:
                csvPath = pathVilla;
                headRecord = headerRecordVilla;
                break;
            case HOUSE:
                csvPath = pathHouse;
                headRecord = headerRecordHouse;
                break;
            case ROOM:
                csvPath = pathRoom;
                headRecord = headerRecordRoom;
                break;
            case CUSTOMER:
                csvPath = pathCustomer;
                headRecord = headerRecordCustomer;
                break;
            case EMPLOYEE:
                csvPath = pathEmployee;
                headRecord = headerRecordEmployee;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + entityType);
        }

        Path path = Paths.get(csvPath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(csvPath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<E> strategy = new ColumnPositionMappingStrategy<>();
        switch (entityType) {
            case VILLA:
                strategy.setType((Class<? extends E>) Villa.class);
                break;
            case HOUSE:
                strategy.setType((Class<? extends E>) House.class);
                break;
            case ROOM:
                strategy.setType((Class<? extends E>) Room.class);
                break;
            case CUSTOMER:
                strategy.setType((Class<? extends E>) Customer.class);
                break;
            case EMPLOYEE:
                strategy.setType((Class<? extends E>) Employee.class);
                break;
            default:

        }
        strategy.setColumnMapping(headRecord);
        CsvToBean<E> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<E>(new FileReader(csvPath))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<E>) csvToBean.parse();
    }

    //Display list from CSV method
    public static <E> void displayList(ArrayList<E> arrayList) {
        int i = 1;
        System.out.println("---------------LIST--------------");
        for (E element : arrayList) {
            System.out.println("NO: " + i);
            if (element instanceof Villa) {
                ((Villa) element).showInfor();
            } else if (element instanceof House) {
                ((House) element).showInfor();
            } else if (element instanceof Room) {
                ((Room) element).showInfor();
            }else if(element instanceof Customer){
                ((Customer) element).showInfor();
//            }else if(element instanceof Employee){
//                System.out.println((Employee) element));
            }
            i++;
            System.out.println("---------------END--------------");
        }
    }


    //Show All Name Not Duplicate method
    public static void showAllNameNotDuplicate(EntityType entityType){
        String csvPath = "";
        switch (entityType){
            case VILLA:
                csvPath = pathVilla;
                break;
            case HOUSE:
                csvPath = pathHouse;
                break;
            case ROOM:
                csvPath = pathRoom;
                break;
        }
        Path path = Paths.get(csvPath);
        if(!Files.exists(path)){
            System.out.println("---File csv path does not exists!");
            processMain();
        }
        TreeSet<String> treeSet = FuncReadWriteCSV.getAllNameServicesFromCsv(csvPath);
        System.out.println("---List Name Of Service Not Duplicate");
        for(String str: treeSet){
            System.out.println(str);
            System.out.println("-------------");
        }
        processMain();
    }
}



