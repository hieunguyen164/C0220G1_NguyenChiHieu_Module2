package b1_ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        final int RATE = 23000;
        int vnd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int usd = input.nextInt();
        vnd = usd * RATE;
        System.out.printf("VND = %d" , vnd);
    }
}
