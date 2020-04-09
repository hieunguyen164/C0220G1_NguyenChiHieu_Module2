package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10.");
            }
        } while (size > 10);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.printf("%-15s%s", "Array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.printf("\n"+"%-15s%s", "Index: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
        }
        int index;
        System.out.print("\nEnter position of element you want to delete: ");
        index = input.nextInt();
        if (index < 0 || index > (array.length - 1)) {
            System.out.println("Cannot delete.");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.printf("%-15s%s", "New array: ", "");
            for (int i = 0; i < array.length-1; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
