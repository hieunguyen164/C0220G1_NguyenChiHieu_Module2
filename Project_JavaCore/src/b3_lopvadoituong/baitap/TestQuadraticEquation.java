package b3_lopvadoituong.baitap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        System.out.println("Equation: "+a+"x^2 + "+b+"x + "+c+" = 0");
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if(delta == 0){
            System.out.println("x = "+equation.getRoot1());
        }else if(delta>=0){
            System.out.println("x1 = "+equation.getRoot1());
            System.out.println("x2 = "+equation.getRoot2());
        }else{
            System.out.println("“The equation has no roots”");
        }
    }
}
