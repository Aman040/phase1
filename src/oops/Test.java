package oops;
class Bicycle{
	public int gear;
	      int speed;
	      public Bicycle(int gear,int speed) {
	    	  this.gear=gear;
	    	  this.speed=speed;
	      }
	      public void applyBrake(int decrement) {
	    	  speed-=decrement;
	      }
	      public void speedUp(int increment) {
	    	  speed+=increment;
	      }
	      public String toString() {
	    	  return ("No. of gears are "+gear+"\nspeed of bicycle is "+speed);
	      }
}
class  MountainBike extends Bicycle{
	int seatHeight;
	public MountainBike(int gear,int speed ,int seatHeight) {
		super(gear,speed);
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}
	public String toString() {
		return (super.toString())+"\nseat height is " +seatHeight;
	}
}
public class Test {
	
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(3,100,25);
		System.out.println(mb.toString());

	}

}
