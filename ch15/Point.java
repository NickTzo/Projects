package gr.aueb.cf.ch15;

public class Point {
    private int x;

    private double distance;


    public Point() {
    }

    public Point(int x) {
        this.x = x;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }

    public double getDistanceFromOrigin(){
         distance = x;
         return distance;
    }
}
