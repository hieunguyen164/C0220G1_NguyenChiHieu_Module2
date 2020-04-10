package b3_lopvadoituong.baitap;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on { " +
                    ((getSpeed() == 1) ? "SLOW" : (getSpeed() == 2) ? "MEDIUM" : (getSpeed() == 3) ? "FAST" : "") +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    '}';
        } else {
            return "Fan is off { " +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    '}';
        }
    }
}

