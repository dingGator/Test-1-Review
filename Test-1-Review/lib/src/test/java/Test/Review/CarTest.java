package Test.Review;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		
		Car oldCar = new Car();
		oldCar.accelerate(20);
		//assertEquals("black", foo.getOutput());
		assertEquals("black car now doing 20mph in drive", oldCar.getOutput());
		
		int carCount = Car.getNumberOfCars();
		assertEquals(1,Car.getNumberOfCars());
		
		Car littleRedCorvette = new Car("red", Transmission.MANUAL);
		//assertEquals("red", littleRedCorvette.getOutput());
		littleRedCorvette.accelerate(20);
		littleRedCorvette.accelerate(30);
		littleRedCorvette.accelerate(40);
		assertEquals("red car now doing 40mph in 4", littleRedCorvette.getOutput());
		
		carCount = Car.getNumberOfCars();
		assertEquals(2,Car.getNumberOfCars());
	}

}
