package OOP;

import java.awt.*;

public class ObjectComposition {

    public static void main(String[] args) {
        Car car = new Car(); // a Car object is created with one Engine object and one Wheel object,
                            // means one cbject is created with different objects is called object composition
        car.run();
    }
}

class Car{
    private Engine engine;
    private Wheel wheel;

    public Car(){
        engine = new Engine();
        wheel = new Wheel();
    }

    public void run(){
        System.out.println("Car is running");
    }
}

class Engine{

}

class Wheel{

}
