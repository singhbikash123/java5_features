package com.java.codeganges.java5;

public class EnumDemo {
	private Day day;

	public EnumDemo(Day day) {
		this.day = day;
	}

	public void display() {

		switch (day) {
		case SUNDAY:
			System.out.println("Sunday is fun day!!");
			break;

		case MONDAY:
			System.out.println("Monday is 2nd day of week!!");
			break;

		case FRIDAY:
			System.out.println("Weekend vibes!!");
			break;
		default:
			System.out.println("Other days are good enough");
			break;

		}

	}

	public static void main(String args[]) {
     
		EnumDemo demo = new EnumDemo(Day.MONDAY);
		demo.display();
		
		EnumDemo demo1 = new EnumDemo(Day.FRIDAY);
		demo1.display();
		
		EnumDemo demow = new EnumDemo(Day.WEDNESDAY);
		demow.display();
		
		EnumDemo demos = new EnumDemo(Day.SUNDAY);
		demos.display();
		
	}

}
