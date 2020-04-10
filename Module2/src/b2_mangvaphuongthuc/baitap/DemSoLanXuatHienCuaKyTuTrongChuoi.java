package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str;
        String c;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = input.nextLine();
        System.out.println("Nhap ki tu can kiem tra: ");
        c = input.nextLine();
        for( int i = 0; i < str.length(); i++){
            if(Character.toString(str.charAt(i)).equals(c)){
                count++;
            }
        }
        System.out.print("Ky tu "+"'"+c+"'"+" xuat hien trong chuoi "+count+" lan.");
    }
}