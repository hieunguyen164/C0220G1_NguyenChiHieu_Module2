package b4_kethua.baitap.loptriangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        String color;
        System.out.print("Enter color: ");
        color = input.nextLine();
        System.out.print("Enter side1: ");
        a = input.nextDouble();
        System.out.print("Enter side2: ");
        b = input.nextDouble();
        System.out.print("Ente side3: ");
        c = input.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
            System.out.println("Not a triangle");
        } else {
           Triangle triangle = new Triangle();
           triangle.setColor(color);
           triangle.setSide1(a);
           triangle.setSide2(b);
           triangle.setSide3(c);
           System.out.println(triangle);
        }
    }


}

