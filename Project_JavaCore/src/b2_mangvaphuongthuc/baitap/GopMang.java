package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] array1 = new int [5];
        int [] array2 = new int [3];
        int [] array3 = new int [array1.length+array2.length];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <array1.length; i++){
            System.out.print("Enter element "+(i+1)+" array1 : ");
            array1[i] = input.nextInt();
        }
        System.out.printf("%-15s%s","Array1:","");
        for(int i = 0; i < array1.length;i++){
            System.out.print(array1[i]+ "\t");
        }
        System.out.println();
        for(int j = 0; j < array2.length; j++){
            System.out.print("Enter element "+(j+1)+" array2 : ");
            array2[j] = input.nextInt();
        }
        System.out.printf("%-15s%s","Array2:","");
        for(int j = 0; j< array2.length; j++){
            System.out.print(array2[j]+"\t");
        }
        for(int i = 0; i < array1.length;i++){
            array3[i] = array1[i];
        }

        int i,j;
        for(i = 0, j = (array1.length); i<array2.length; i++,j++){
            array3[j]=array2[i];
        }

        System.out.printf("\n%-15s%s","Array3:","");
        for(int k = 0; k < array3.length; k++){
            System.out.print(array3[k]+"\t");
        }

    }
}
