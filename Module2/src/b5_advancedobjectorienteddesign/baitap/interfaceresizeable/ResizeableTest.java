package b5_advancedobjectorienteddesign.baitap.interfaceresizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape []shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5,10);

        System.out.println("Before resize:");
        for(Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println("After resize");
        for(Shape shape:shapes){
            shape.resize((Math.random()*100)+1);
            System.out.println(shape);
        }

    }
}

