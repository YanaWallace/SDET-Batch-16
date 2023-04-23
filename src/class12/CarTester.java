package class12;

public class CarTester {
    public static void main(String[] args) {
     Car car1=new Car();
     car1.make="Mercedes";
     car1.model="GWagon";
     car1.color="White";
     car1.mileage=0;
     car1.isAutomatic=true;
     car1.startCar();
     car1.stopCar();
    }
}
