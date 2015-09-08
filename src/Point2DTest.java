import static org.junit.Assert.*;

import org.junit.Test;


public class Point2DTest {

	@Test
	public void testAdd() {
		Point2D p1 = new Point2D();
		Point2D p2 = p1.add(3.0, 5.0);
		assertEquals("p2.x = 3", 3.0, p2.x, 0.00001);
		assertEquals("p2.y = 5", 5.0, p2.y, 0.00001);
		Point2D p3 = p2.add(4.0, 10.0);
		assertEquals("p3.x = 7", 7.0, p3.x, 0.00001);
		assertEquals("p3.y = 15", 15.0, p3.y, 0.00001);
		Point2D p4 = p3.add(-4.0, 0.0);
		assertEquals("p4.x = 3", 3.0, p4.x, 0.00001);
		assertEquals("p3.y = 15", 15.0, p4.y, 0.00001);
	}

	@Test
	public void testTranslate() {
		Point2D p1 = new Point2D(3.0, 5.0);
		Point2D p2 = new Point2D(1.0, 3.0);
		p2.translate(p1);
		assertEquals("p2.x = 4", 4.0, p2.x, 0.00001);
		assertEquals("p2.y = 8", 8.0, p2.y, 0.00001);
	}


	@Test
	public void testDistance() {
		Point2D p1 = new Point2D(2.0, 9.0);
		double distance = p1.distance(-1.0, 5.0);
		assertEquals("distance = 5", 5.0, distance, 0.00001);
	}

	@Test
	public void testToString() {
		Point2D p1 = new Point2D(3.0, 5.0);
		String str = p1.toString();
		assertEquals("(3.0, 5.0)", str);
	}
}
