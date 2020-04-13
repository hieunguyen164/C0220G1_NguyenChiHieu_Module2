package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int index;
        int num;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap so muon them: ");
            num = input.nextInt();
            System.out.print("Nhap vi tri cua phan tu moi: ");
            index = input.nextInt();
            if (index <= 1 || index >= array.length - 1) {
                System.out.println("Invalid index!");
            } else {
                System.out.printf("%-15s%s","Array: ","");
                for(int i = 0; i<array.length;i++){
                    System.out.print(array[i]+"\t");
                }
                for (int j = array.length - 1; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = num;
            }
        }while(index <=1 || index >= array.length -1);
        System.out.println();
        System.out.printf("%-15s%s","New array: ","");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }

}

