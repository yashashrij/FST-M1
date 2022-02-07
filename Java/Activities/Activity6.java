package activities;

import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 Plane plane = new Plane(10);
	     plane.onboard("Yashashri");
	     plane.onboard("Amol");
	     plane.onboard("Anna");
	     System.out.println("Plane took off at: " + plane.takeOff());
	     System.out.println("People on the plane: " + plane.getPassengers());
	     Thread.sleep(5000);
	     
	        plane.land();
	        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
	        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}
	

}


