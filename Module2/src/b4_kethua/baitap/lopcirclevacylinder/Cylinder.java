package b4_kethua.baitap.lopcirclevacylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric() {
        return getArea() * height;
    }
    @Override
    public void setRadius(double radius){
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + " ,volumetric = "
                + getVolumetric()
                + " ,which is a subclass of "
                + super.toString();
    }
}

