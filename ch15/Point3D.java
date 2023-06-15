package gr.aueb.cf.ch15;

public class Point3D extends Point2D{
    private int z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(super.getDistanceFromOrigin() + Math.sqrt(Math.pow(z,2)));
    }
}
