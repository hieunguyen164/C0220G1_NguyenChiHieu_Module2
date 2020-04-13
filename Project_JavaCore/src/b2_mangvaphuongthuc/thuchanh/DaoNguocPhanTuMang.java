package b2_mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20.");
            }
        }while (size > 20);
        array = new int [size];
        for(int i = 0; i<array.length;i++){
            System.out.print("Enter element: "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        for(int x:array){
            System.out.println(x);
        }
        for(int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s","Reverse array: ","");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }
}
