package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

/*QUESTION 9:
------------
     Project   :VehicleInformation	| Package   :org.twowheeler
     Package   :org.allvehicle     	| Class     :TwoWheller
     Class     :Vehicle				| Methods   :bike(),cycle()
     Methods   :VehicleNecessery()  |
     
     Package   :org.threewheeler
     Class     :ThreeWheeler
     Methods   :Auto()

     Package   :org.fourwheeler
     Class     :FourWheeler
     Methods   :car(),bus(),lorry()

Description:
Create an object for all 4 classes  inside the Vehicle 
class and call all classes methods also follow the all coding standards.   */
public class Vehicle {
	public void vehicleNecessary() {
		System.out.println("The necessaries of vehicles are:");
	}
	public static void main(String[] args) {
		Vehicle  v=new Vehicle();
		v.vehicleNecessary();
		TwoWheeler tow=new TwoWheeler();
		tow.bike();
		tow.cycle();
		ThreeWheeler tew=new ThreeWheeler();
		tew.auto();
		FourWheeler fow=new FourWheeler();
		fow.car();
		fow.bus();
		fow.lorry();
		
	}

}
