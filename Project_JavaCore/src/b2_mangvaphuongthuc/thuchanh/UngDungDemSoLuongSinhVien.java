package b2_mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVien {
    public static void main(String[] args) {
        int [] array;
        int size;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if(size > 30){
                System.out.println("Size should not exceed 30.");
            }
        }while(size > 30);
        array = new int [size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter a mark for student "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        for( int j = 0; j < array.length; j++){
            System.out.print(array[j]+"\t");
            if(array[j]>=5){
                count ++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
