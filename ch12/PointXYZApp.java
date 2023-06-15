package gr.aueb.cf.ch12;

public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ();
        point.setX(1);
        point.setY(2);
        point.setZ(3);
        System.out.println(point.convertToString());
    }
}
