public class Square extends Polygon{

	public Square(double side){
		super(4);
		for(int i=0;i<4;i++)
			sides[i] = side;
	}

	public void calArea(){
		area = sides[0] * sides[0];
	}

}
