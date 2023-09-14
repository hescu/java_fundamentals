package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class Polymorphism_Exercise_01 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5.6, 13.5);
    }
}

interface Shape {
    double volume(double x, double y);
    double surface(double x, double y);
}

class Cylinder implements Shape{
    double x, y;
    int a, b;

    public Cylinder(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Cylinder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double volume(double height, double radius) {
        return height * 3.14159 * (radius * radius);
    }

    public double volume(int height, int radius) {
        return height * 3.14159 * (radius * radius);
    }

    public double volume(double height, double radius, double innerDiameter) {
        return height * 3.14159 * (2 * radius - innerDiameter * innerDiameter ) / 4;
    }

    @Override
    public double surface(double height, double radius) {
        return 2 * 3.14159 * radius * (radius + height);
    }
}