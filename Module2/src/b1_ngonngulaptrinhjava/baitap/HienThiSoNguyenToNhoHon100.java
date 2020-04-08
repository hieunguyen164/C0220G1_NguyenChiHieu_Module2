package b1_ngonngulaptrinhjava.baitap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int max = 100;
        int num = 2;
        while (num < max) {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
            }
            num++;
        }
    }
}

