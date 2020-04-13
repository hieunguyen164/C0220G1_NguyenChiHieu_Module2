package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        int size;
        double matrix[][];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = input.nextInt();
        matrix = new double[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Enter value for row " + row + "," + " column " + col + " : ");
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    sum +=matrix[row][col];
                }
            }
        }
        System.out.print("Tong cac so o duong cheo chinh la: "+sum);
    }
}