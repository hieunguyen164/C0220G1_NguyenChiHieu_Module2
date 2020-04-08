package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TimGTLNTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int max = matrix[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        Scanner input = new Scanner(System.in);
        for( int i = 0; i < matrix.length;i++){
            for( int j = 0; j < matrix[i].length; j++){
                System.out.print("Enter value for row "+ i +", "+"columns "+j+" : ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix value: ");
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    indexRow  = i;
                    indexColumn = j;
                }
            }
        }
        System.out.println("Max valuse is: "+max+" at row "+indexRow+" ,column "+indexColumn);
    }
}
