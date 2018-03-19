public class Bicycle implements Vehicle{

	private int speed;
	private int gear;

	public Bicycle(int speed,int gear){
		this.speed = speed;
		this.gear = gear;
	}

	public void setSpeed(int sp){
		speed = sp;
	}

	public void setGear(int g){
		gear = g;
	}

	public int getSpeed(){
		return speed;
	}

	public int getGear(){
		return gear;
	}

	public String toString(){
		return "Speed:" + speed +" Gear:" + gear;
	}

	public void changeGear(int a){
		gear += a;
	}
    public void speedUp(int a){
    	speed = a*2;

    }
    public void applyBrakes(int a){
    	speed += a;
    }

}