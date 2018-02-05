public class Point{
	private double x,y,z; //Attributes

	 //Constructor
	public Point(){

	}
	public Point(double x,double y,double z){ 
		this.x = x;
		this.y = y;
		this.z = z;
	}

	//Accessor
			//setters
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setZ(double z){
		this.z = z;
	}
			//getters
	public double getX(){
		return	this.x;
	}
	public double getY(){
		return this.y;
	}
	public double getZ(){
		return this.z;
	}
	
	 //Method - setnewpoint
	public void setPoint(Point newpoint){
		this.x = newpoint.getX();
		this.y = newpoint.getY();
		this.z = newpoint.getZ();
	}
	public void setxyz(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}