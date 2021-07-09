package Test.Review;


public class Car {
	
	private String color = "blue";
	private int currentMph;
	private int currentGear = 1;
	private Transmission transmission;
	private static int numberOfCars = 0;
	
	Car() {
		this("black",Transmission.AUTOMATIC);
	}
	Car(String inColor, Transmission t) {
		this.color = inColor;
		this.currentMph = 0;
		this.transmission = t;
		numberOfCars++;
	}
	public String getOutput() {
		
		return (this.color + " car now doing " + this.currentMph + "mph"
				+ " in " + this.getGear());
	}
	
	private String getGear() {
		if(this.transmission == Transmission.AUTOMATIC) {
			return "drive";
		} else {
			return "" + this.currentGear;
		}
		
	
		
	}
	public void accelerate(int mph) {
		
		this.currentMph = mph;
		this.currentGear++;
	}
	public static int getNumberOfCars() {
		
		int numberOfCars = 3;
		// still good because the Car.numberOfCars specify
		// the variable in the car class
		return Car.numberOfCars;
	}
	
}
