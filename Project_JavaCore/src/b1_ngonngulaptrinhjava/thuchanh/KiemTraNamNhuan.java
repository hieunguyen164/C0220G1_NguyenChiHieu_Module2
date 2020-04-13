package b1_ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        boolean check = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    check = true;
                }
            }else{
                check = true;
            }
        }
        if(check){
            System.out.printf("%d is a leap year.",year);
        }else{
            System.out.printf("%d is not a leap year.", year);
        }
    }
}
