package casestudy.commons;

import casestudy.customexception.*;
import casestudy.models.Services;
import casestudy.models.*;

import java.util.Calendar;

public class FuncValidation {
    private static String pattern = "";

    public static boolean isValidIdService(Services services, String str) {
        if (services instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        } else if (services instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        } else if (services instanceof Room) {
            pattern = "SVRO-\\d{4}$";
        }
        return str.matches(pattern);
    }

    public static boolean isValidNameService(String str) {
        pattern = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,8}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(pattern);
    }

    public static boolean isValidFreeServices(String str) {
        pattern = "massage|karaoke|food|drink|car";
        return str.matches(pattern);
    }

    public static boolean isValidBirthday(String str) {
        pattern = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        return str.matches(pattern);
    }

    public static boolean isValidGender(String str){
        pattern = "^(?i:Male|Female|Unknown)$";
        return str.matches(pattern);
    }

    public static boolean isValidIdNumber(String str){
        pattern = "^\\d{9}$";
        return str.matches(pattern);
    }

    public static boolean isValidEmail(String str){
        pattern = "^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}$";
        return str.matches(pattern);
    }

    //Get Valid Id Service Method
    public static String getValidIdService(Services services, String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidIdService(services, result)) {
            System.out.println(errMess);
            result = getValidIdService(services, strDisplay, errMess);
        }
        return result;
    }

    //Get Valid Service Name method
    public static String getValidName(String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)) {
            System.out.println(errMess);
            result = getValidName(strDisplay, errMess);
        }
        return result;
    }

    //Get Valid Double Number method
    public static double getValidDoubleNumber(String strDisplay, String errMess, Double min) {
        double result = 0.0;
        System.out.println(strDisplay);
        try {
            result = Double.parseDouble(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMess);
            }
        } catch (Exception e) {
            System.out.println(errMess);
            result = getValidDoubleNumber(strDisplay, errMess, min);
        }
        return result;
    }

    //Get Valid Integer Number method
    public static Integer getValidIntegerNumber(String strDisplay, String errMess, Integer min) {
        return getValidIntegerNumber(strDisplay, errMess, min, null);
    }

    public static Integer getValidIntegerNumber(String strDisplay, String errMess, Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);
        try {
            result = Integer.parseInt(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMess);
            }
        } catch (Exception e) {
            System.out.println(errMess);
            result = getValidIntegerNumber(strDisplay, errMess, min, max);
        }
        return result;
    }

    //Get Valid Free Services methos
    public static String getValidFreeServices(String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidFreeServices(result)) {
            System.out.println(errMess);
            result = getValidFreeServices(strDisplay, errMess);
        }
        return result;
    }

    //Get Valid Customer Name method
    public static String getValidCustomerName(String strDisplay, String errMess) {
        String result;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidNameService(result)) {
                throw new NameException(errMess);
            }
        } catch (NameException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);
        }
        return result;
    }

    //Get Valid BirthDay method
    public static String getValidBirthDay(String strDisplay, String errMess) {
        String result;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidBirthday(result)) {
                throw new BirthDayException(errMess);
            }
            int year = Integer.parseInt(result.substring(6,10));
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if(year<=1990 || currentYear - year <= 18){
                throw new BirthDayException(errMess);
            }
        } catch (BirthDayException e) {
            System.out.println(errMess);
            result = getValidBirthDay(strDisplay, errMess);
        }
        return result;
    }

    //Get Valid Gender method
    public static String getValidGender(String strDisplay, String errMess){
        String result;
        System.out.println(strDisplay);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidGender(result)){
                throw new GenderException(errMess);
            }
        }catch(GenderException e){
            System.out.println(errMess);
            result = getValidGender(strDisplay, errMess);
        }
        return result;
    }

    //Get Valid ID Number method
    public static String getValidIdNumber(String strDispay, String errMess){
        String result;
        System.out.println(strDispay);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidIdNumber(result)){
                throw new IdNumberException(errMess);
            }
        }catch(IdNumberException e){
            System.out.println(errMess);
            result = getValidIdNumber(strDispay, errMess);
        }
        return result;
    }

    //Get Valid Email method
    public static String getValidEmail(String strDisplay, String errMess){
        String result;
        System.out.println(strDisplay);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidEmail(result)){
                throw new EmailException(errMess);
            }
        }catch(EmailException e){
            System.out.println(errMess);
            result = getValidEmail(strDisplay,errMess);
        }
        return result;
    }
}


