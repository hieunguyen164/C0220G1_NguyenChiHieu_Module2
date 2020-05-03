package casestudy_javacore.controllers;

import casestudy_javacore.commons.FuncGeneric;
import casestudy_javacore.commons.ScannerUtils;
import casestudy_javacore.data.Resume;
import casestudy_javacore.models.Employee;

import java.util.*;

import static casestudy_javacore.controllers.MainController.processMain;

public class EmployeeController {

    //Show Information Of Employee method
    public static void showInformationOfEmployee(){
        ArrayList<Employee> employeeList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        Map<String, Employee> map = new HashMap<>();
        for(Employee employee : employeeList){
            map.put(employee.getId(),employee);
        }
        displayMap(map);
        processMain();
    }

    //Display Map method
    public static void displayMap(Map<String, Employee> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.println("Key: " + m.getKey() + "\n" + m.getValue().toString());
        }
    }

        //Find Employee method
        public static void findEmployee () {
            Stack<Employee> employeeStack = Resume.getAllEmployee();
            System.out.println("Enter key of employee:");
            String inputSearch = ScannerUtils.scanner.nextLine();
            try{
                while (true){
                    boolean foundById = employeeStack.peek().getId().contains(inputSearch);
                    if(!foundById){
                        employeeStack.pop();
                    }else{
                        System.out.println("---Found employee below:");
                        System.out.println(employeeStack.peek().toString());
                        break;
                    }
                }
            }catch (EmptyStackException ex){
                System.out.println("Invalid Key! Please try again.");
                findEmployee();
            }
            processMain();
        }

    }