package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if(size > 10){
                System.out.println("Size should not exceed 10.");
            }
        }while(size > 10);
        array = new int [size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element "+ (i+1)+" : ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for(int i = 0; i<array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.print("Min value is: "+ min);
    }
}
