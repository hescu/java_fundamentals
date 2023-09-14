package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class Polymorphism_Exercise03 {
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Engine gasolineEngine = new GasolineEngine();

        Car electricCar = new Car(electricEngine);
        Car gasolineCar = new Car(gasolineEngine);

        electricCar.startCar();
        gasolineCar.startCar();
    }
}

interface Engine {
    void start();
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }
}

class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine started.");
    }
}

class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}