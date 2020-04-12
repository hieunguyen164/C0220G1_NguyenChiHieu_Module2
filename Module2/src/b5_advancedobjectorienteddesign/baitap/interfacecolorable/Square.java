package b5_advancedobjectorienteddesign.baitap.interfacecolorable;

public class Square extends Shape implements Colorable {
    double side = 1;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    @Override
    public String toString(){
        return "A square with area = "+getArea();
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
