package b2_mangvaphuongthuc.baitap;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.print("Enter c: ");
        c = input.nextInt();
        check(a, b, c);

    }

    private static void check(int a, int b, int c) {
        try {
            if (a < 0 || b < 0 || c < 0 ||a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException();
            } else{
                    System.out.println("is a triangle");
                }

        } catch (IllegalTriangleException e) {
            System.err.println("not a triangle");
        }
    }
}






