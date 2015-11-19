package com.ericsson.clases;

public class MainVolcanoRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VolcanoRobot dante = new VolcanoRobot();
			dante.status = "exploring";
			dante.speed = 2;
			dante.temperature = 510;
			dante.showAttributes();
			System.out.println("Increasing speed to 3.");
			dante.speed = 3;
			dante.showAttributes();
			System.out.println("Changing temperature to 670.");
			dante.temperature = 670;
			dante.showAttributes();
			System.out.println("Checking the temperature.");
			dante.checkTemperature();
			dante.showAttributes();
			
			System.out.println("\n---Virgil---");
			VolcanoRobot virgil = new VolcanoRobot();
			virgil.status = "nuevo";
			virgil.speed = 4;
			virgil.temperature = 110;
			virgil.showAttributes();
			
	}

}
