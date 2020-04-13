package b4_kethua.baitap.lopcirclevacylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "blue";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = "
                + getRadius()
                +" ,area = "
                +getArea()
                +" and color is "
                + getColor();
    }
}
