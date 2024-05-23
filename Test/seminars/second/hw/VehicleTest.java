package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
  Car car = new Car("toyota","camry",2015);
  @Test
  public void testInstanceofVehicle() {

    assertTrue(car instanceof Vehicle);
  }

  @Test
  public void carContains4Wheels() {
    assertEquals(4, car.getNumWheels());  }
  Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2020);
  @Test
  public void motorcycleContains2Wheels() {
    assertEquals(2, motorcycle.getNumWheels());
  }
  @Test
  public  void testCarsSpeed() {
    assertEquals(60, car.testDrive());
  }
  @Test
  public  void testMotorcyclesSpeed() {
    assertEquals(75, motorcycle.testDrive());
  }
  @Test
  public void testCarSpeedOfPark() {
    car.testDrive();
    car.park();
    assertEquals(0, car.getSpeed());
  }
  @Test
  public void testMotoSpeedOfPark() {
    motorcycle.testDrive();
    motorcycle.park();
    assertEquals(0, motorcycle.getSpeed());
  }
}
