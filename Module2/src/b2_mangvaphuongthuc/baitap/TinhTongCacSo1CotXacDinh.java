package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongCacSo1CotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colNum;
        int [][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("Matrix: ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col]+"\t");
            }
            System.out.println();
        }
        do {
            System.out.print("Nhap so thu tu cua cot muon tinh tong: ");
            colNum = input.nextInt();
            if(colNum < 0 || colNum>matrix[0].length-1){
                System.out.println("Cot dau tien bat dau tu 0.");
            }
        }while(colNum<0 || colNum>matrix[0].length-1);
        int total = 0;
        for( int row = 0; row < matrix.length; row++ ){
            total += matrix[row][colNum];
        }
        System.out.print("Tong cac phan tu cot thu "+colNum+" = "+total);
    }
}
