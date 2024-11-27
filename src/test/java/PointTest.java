import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void getX() {
        // ARRANGE
        Point point = new Point(1, 2, 3);

        // ACT
        double x = point.getX();

        // ASSERT
        Assert.assertEquals(1, x, 1E-10);
    }

    @Test
    public void getY() {
        // ARRANGE
        Point point = new Point(1, 2, 3);

        // ACT
        double y = point.getY();

        // ASSERT
        Assert.assertEquals(2, y, 1E-10);
    }

    @Test
    public void getZ() {
        // ARRANGE
        Point point = new Point(1, 2, 3);

        // ACT
        double z = point.getZ();

        // ASSERT
        Assert.assertEquals(3, z, 1E-10);
    }

    @Test
    public void naturalOrdering_AGreaterThanB() {
        // ARRANGE
        Point pointA = new Point(1, 2, 3);
        Point pointB = new Point(0, 0, 0);

        // ACT
        int comparison = pointA.compareTo(pointB);

        // ASSERT
        Assert.assertTrue(comparison > 0);
    }

    @Test
    public void naturalOrdering_ALessThanB() {
        // ARRANGE
        Point pointA = new Point(1, 2, 3);
        Point pointB = new Point(4, 4, 4);

        // ACT
        int comparison = pointA.compareTo(pointB);

        // ASSERT
        Assert.assertTrue(comparison < 0);
    }

    @Test
    public void naturalOrdering_equalTo() {
        // ARRANGE
        Point pointA = new Point(1, 2, 3);
        Point pointB = new Point(1, 2, 3);

        // ACT
        int comparison = pointA.compareTo(pointB);

        // ASSERT
        Assert.assertEquals(0, comparison);
    }

    @Test
    public void naturalOrdering_AGreaterThanB_notOnZ() {
        // ARRANGE
        Point pointA = new Point(1, 2, 3);
        Point pointB = new Point(1, 0, 0);

        // ACT
        int comparison = pointA.compareTo(pointB);

        // ASSERT
        Assert.assertTrue(comparison > 0);
    }

    @Test
    public void naturalOrdering_ALessThanB_notOnZ() {
        // ARRANGE
        Point pointA = new Point(1, 2, 3);
        Point pointB = new Point(1, 2, 4);

        // ACT
        int comparison = pointA.compareTo(pointB);

        // ASSERT
        Assert.assertTrue(comparison < 0);
    }
}
