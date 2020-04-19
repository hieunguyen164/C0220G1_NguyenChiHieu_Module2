package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = new int[]{10,4,6,7,8,0,0,0,0};
        int X;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s","Array: ");
        for(int i=0; i< array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("Enter X:");
        X = input.nextInt();
        do {
            System.out.println("Enter index:");
            index = input.nextInt();
            if (index < 0 || index > array.length - 1) {
                System.out.println("Failed");
            }
        } while (index < 0 || index > array.length - 1);
        for(int i = array.length -1; i>index ;i--){
            array[i] = array[i-1];
        }
        array[index] = X;
        System.out.printf("%-15s","New Array: ");
        for(int i=0; i < array.length;i++){
            System.out.print(array[i]+"\t");
        }

    }

}

