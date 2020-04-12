package b5_advancedobjectorienteddesign.baitap.interfacecolorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Square(15);
        for(Shape shape:shapes){
            System.out.println(shape);
            }
        }
    }

