package b4_kethua.baitap.pointvamoveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public MoveablePoint move(){
        this.setX(this.getX()+this.getxSpeed());
        this.setY(this.getY()+this.getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x = "+ getX() +
                " y = "+ getY() +
                " xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
}
