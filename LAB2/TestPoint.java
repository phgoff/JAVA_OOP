public class TestPoint{

	public static void main(String[] args) {
		
		Point a,b,c;
		a = new Point(1.0,2.0,3.0);
		b = new Point(1.9,2.9,3.9);
		c = new Point();

		System.out.println("A: ("+a.getX()+","+a.getY()+","+a.getZ()+")");
		System.out.println("B: ("+b.getX()+","+b.getY()+","+b.getZ()+")");
		System.out.println("C: ("+c.getX()+","+c.getY()+","+c.getZ()+")");
		b.setPoint(a);
		System.out.println("New B: ("+b.getX()+","+b.getY()+","+b.getZ()+")");
		c.setxyz(5.0,6.0,7.0);
		System.out.println("C: ("+c.getX()+","+c.getY()+","+c.getZ()+")");
	}

}