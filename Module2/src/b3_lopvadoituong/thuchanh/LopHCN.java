package b3_lopvadoituong.thuchanh;

import java.util.Scanner;

public class LopHCN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = input.nextDouble();
        System.out.println("Enter height:");
        double height = input.nextDouble();
        LopHCN rectangle = new LopHCN(width,height);
        System.out.println("Your Rectangle \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }

    double width,height;

    public LopHCN(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}


