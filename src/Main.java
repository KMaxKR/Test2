import car.Audi;
import car.BMW;
import car.Car;
import car.Park;

public class Main {
    public static void main(String[] args){

        Car[] cars = new Car[2];
        cars[0] = new Audi();
        cars[1] = new BMW();

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getName() +" speed is " + cars[i].getSpeed());
        }

        System.out.println("Audi speed is " + cars[0].getSpeed());
        System.out.println("BMW speed is " + cars[1].getSpeed());



        Park park = new Park();

        Car audi = new Audi();
        Car bmw = new BMW();

        park.parkInfo(audi);
        park.parkInfo(bmw);

        park.numberOfCars(2);
    }
}