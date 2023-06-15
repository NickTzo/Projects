package gr.aueb.cf.ch15;

public class PointUtil {
    public static void main(String[] args) {
        Point p1 = new Point(5);
        Point p2 = new Point2D(5,5);
        Point p3 = new Point3D(3,3,3);


//        ((Point2D)p2).setY(5);
        p3.getDistanceFromOrigin();


        System.out.println(distanceFromOrigin(p1));
        System.out.println(distanceFromOrigin(p2));
        System.out.println(distanceFromOrigin(p3));


    }

    public static double distanceFromOrigin(Point point){
        return point.getDistanceFromOrigin();
    }
}
