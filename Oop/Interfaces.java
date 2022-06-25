package Oop;

interface Engine {

    final static int price = 10000;

    void start();

    abstract void stop();

    abstract void accelerate();
}

interface Brake extends Engine { // here i extend the interface so no need to implement in subclass

    abstract void Brakes();
}

public class Interfaces implements Brake {

    @Override
    public void start() {
        System.out.println("Start the car: " + price);

    }

    @Override
    public void stop() {
        System.out.println("Stop the car");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the car");

    }

    @Override
    public void Brakes() {
        System.out.println("Brake Called");

    }

}

class InterfaceCall {
    public static void main(String[] args) {
        Interfaces I = new Interfaces();
        I.start();
        I.stop();
        I.accelerate();
        I.Brakes();
    }

}