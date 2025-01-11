package Vector3D;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getMagnitude(double x, double y, double z) {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public static void main(String[] args) {
        Vector3D vectors = new Vector3D(5.0, 10.0, 15.0);
        System.out.println("The vector for x is: " + vectors.getX());
        System.out.println("The vector for y is: " + vectors.getY());
        System.out.println("The vector for z is: " + vectors.getZ());
        System.out.println("The magnitude is: " + vectors.getMagnitude(1.0, 3.0, 4.0));
    }
}
