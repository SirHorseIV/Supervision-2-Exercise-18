public class Point implements Comparable<Point> {
    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    @Override
    public int compareTo(Point other) {
        if (z < other.z) return -1;
        if (z > other.z) return 1;
        if (y < other.y) return -1;
        if (y > other.y) return 1;
        if (x < other.x) return -1;
        if (x > other.x) return 1;
        return 0;
    }
}
