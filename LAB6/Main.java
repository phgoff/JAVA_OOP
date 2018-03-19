public class Main{

	public static void main(String[] args) {

		Square sq = new Square(3.0);
		sq.calArea();
		System.out.println(sq.getArea());

		Bicycle b = new Bicycle(100,2);
		b.applyBrakes(9);
		//b.speedUp(5);
		b.changeGear(1);
		System.out.println(b);

	}
}