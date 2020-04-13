package b1_ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int N = 2;
        System.out.println("Nhap so luong so nguyen to muon hien thi:");
        int num = input.nextInt();
        while(count<num){
            boolean check = true;
            for( int i = 2; i <= Math.sqrt(N); i++){
                if( N % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
