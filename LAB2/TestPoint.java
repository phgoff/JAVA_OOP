public class TestPoint{
	public static void main(String[] args) {
		Point a,b,c;
		a = new Point(1.0,2.0,3.0);
		b = new Point(1.9,2.9,3.9);
		c = new Point();

		c.setX(-1.1);
		System.out.println("a: ("+a.getX()+","+a.getY()+","+a.getZ()+")");
		System.out.println("b: ("+b.getX()+","+b.getY()+","+b.getZ()+")");
		System.out.println("c: ("+c.getX()+","+c.getY()+","+c.getZ()+")");
		b.setPoint(a);
		System.out.println("new b: ("+b.getX()+","+b.getY()+","+b.getZ()+")");

		c.setxyz(5.0,6.0,-7.0);
		System.out.println("set c: ("+c.getX()+","+c.getY()+","+c.getZ()+")");
	}
}