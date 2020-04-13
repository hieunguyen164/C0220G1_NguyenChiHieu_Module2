package b5_advancedobjectorienteddesign.thuchanh.comparator;

import b4_kethua.thuchanh.lopcacdoituonghinhhoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigio",false);
        System.out.println("Pre-sort:");
        for(Circle circle:circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted:");
        for(Circle circle:circles){
            System.out.println(circle);
        }
    }
}
