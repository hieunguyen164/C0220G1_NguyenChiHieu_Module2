package b1_ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice:");
        choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(int i = 0; i < 3; i++){
                        for( int j = 0; j < 10; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 5; i > 0; i--){
                        for(int j = 0; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 5-i;j++){
                            System.out.print(" "); /*in ra màn hình khoảng trắng đến vị trí thứ n-i */
                        }
                        for(int j = 1; j <= 2*i-1; j++){
                            System.out.print("*"); /*tiếp tục in ra màn hình * đến vị trí 2*i-1 */
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
