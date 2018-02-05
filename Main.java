public class Main{
	
  public static void main(String[] args){
	Point pt,a;
	a = new Point(4.0f,5.0f,-6.0f);
	pt = new Point(1.0f,2.0f,-1.0f);
	
	//pt.setxyz(5.0f,2.5f,1.2f);
	a.setPoint(pt);

System.out.println("Point x y z : " + pt.getx()+pt.gety()+pt.getz());
System.out.println("a.Point x y z : " + a.getx()+a.gety()+a.getz());
	
	

  }

}
