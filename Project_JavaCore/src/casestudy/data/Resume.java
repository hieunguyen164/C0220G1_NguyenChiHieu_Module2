package casestudy.data;

import casestudy.commons.FuncGeneric;
import casestudy.models.Employee;

import java.util.ArrayList;
import java.util.Stack;

public class Resume {
    public Resume() {

    }

    public static Stack<Employee> getAllEmployee() {
        Stack<Employee> employeeStack = new Stack<>();
        ArrayList<Employee> employeeArrayList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        for(Employee employee:employeeArrayList){
            employeeStack.push(employee);
        }
        return employeeStack;
    }
}