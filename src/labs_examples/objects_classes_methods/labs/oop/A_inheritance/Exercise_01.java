package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Exercise_01 {
    public static void main(String[] args) {
        Mammal elephant = new Mammal("African Elephant", false, 4, 37.5,false);
        Bird eagle = new Bird("Eagle", false, 4, 40.5, false);
        Fish shark = new Fish("Great White", false, 8, 19.7, "shark");

        elephant.move();
        eagle.raiseBodyTemp();
        System.out.println(eagle.bodyTemp);
        shark.move();
        elephant.grab("stick");
    }
}

class Animal {
    String name;
    boolean isExtinct;
    int numberOfLimbs;
    double bodyTemp;

    public Animal(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp) {
        this.name = name;
        this.isExtinct = isExtinct;
        this.numberOfLimbs = numberOfLimbs;
        this.bodyTemp = bodyTemp;
    }

    protected void raiseBodyTemp() {
        this.bodyTemp += 0.1;
    }

    protected void move() {
        System.out.println("Moving...");
    }
}

class WarmBlooded extends Animal {
    public WarmBlooded(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp) {
        super(name, isExtinct, numberOfLimbs, bodyTemp);
    }

    @Override
    protected void raiseBodyTemp() {
        this.bodyTemp += 0.2;
    }
}

class ColdBlooded extends Animal {
    String type;
    public ColdBlooded(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp, String type) {
        super(name, isExtinct, numberOfLimbs, bodyTemp);
        this.type = type;
    }
}

class Bird extends WarmBlooded {
    boolean canFly;

    public Bird(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp, boolean canFly) {
        super(name, isExtinct, numberOfLimbs, bodyTemp);
        this.canFly = canFly;
    }
    @Override
    protected void move() {
        System.out.println("Flying...");
    }
}

class Mammal extends WarmBlooded {
    boolean hasOpposableThumb;
    public Mammal(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp, boolean hasOpposableThumb) {
        super(name, isExtinct, numberOfLimbs, bodyTemp);
        this.hasOpposableThumb = hasOpposableThumb;
    }

    @Override
    protected void raiseBodyTemp() {
        this.bodyTemp += 0.3;
    }

    @Override
    protected void move() {
        System.out.println("Running...");
    }

    protected void grab(String item) {
        if (hasOpposableThumb) {
            System.out.println("Grabbing " + item +  " with my hand...");
        } else {
            System.out.println("Cannot hold " + item + " :(");
        }
    }
}

class Fish extends ColdBlooded {
    public Fish(String name, boolean isExtinct, int numberOfLimbs, double bodyTemp, String type) {
        super(name, isExtinct, numberOfLimbs, bodyTemp, type);
    }

    @Override
    protected void raiseBodyTemp() {
        this.bodyTemp += 0.0;
    }

    @Override
    protected void move() {
        System.out.println("Swimming...");
    }
}