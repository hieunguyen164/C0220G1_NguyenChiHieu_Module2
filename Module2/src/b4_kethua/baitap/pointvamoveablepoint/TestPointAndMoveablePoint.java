package b4_kethua.baitap.pointvamoveablepoint;

public class TestPointAndMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(10,20);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(5,10,15,20);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
