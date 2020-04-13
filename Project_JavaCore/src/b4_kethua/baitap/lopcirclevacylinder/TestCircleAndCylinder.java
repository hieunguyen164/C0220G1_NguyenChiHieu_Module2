package b4_kethua.baitap.lopcirclevacylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2);
        System.out.println(cylinder);
        cylinder = new Cylinder(3,2,"red");
        System.out.println(cylinder);
    }
}
