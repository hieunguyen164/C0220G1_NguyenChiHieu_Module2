package b2_mangvaphuongthuc.thuchanh;


import java.util.Scanner;

public class TimGTLNTrongMang {
    public static void main(String[] args) {
       int size;
       int [] array;
       Scanner input = new Scanner(System.in);
       do{
           System.out.print("Enter a size: ");
           size = input.nextInt();
           if(size > 20){
               System.out.println("Size should not exceed 20.");
           }
       }while (size > 20);
       array = new int [size];
       for ( int i = 0; i < array.length;i++){
           System.out.print("Enter element "+ (i+1)+" : ");
           array[i] = input.nextInt();
       }
       for ( int x : array){
           System.out.println(x);
       }
       int max = array[0];
       int index = 1;
       for( int i = 0; i < array.length; i++){
           if(max < array[i]){
               max = array[i];
               index = i + 1;
           }
       }
        System.out.println("The largest property value in the list is "+ max + " ,at position "+ index);
    }
}
