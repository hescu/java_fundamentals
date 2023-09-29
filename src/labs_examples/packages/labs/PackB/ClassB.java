package labs_examples.packages.labs.PackB;

import labs_examples.packages.labs.PackA.ClassA;

public class ClassB {
    public static void main(String[] args) {
        showResult(55, 77);
    }
    public static void sayHello() {
        System.out.println("Hi, I am a static method in ClassA.");
    }

    protected static void showResult(int x, int y) {
        int result = ClassA.numHub(x, y);
        System.out.println("Access to the protected multiply-method is restricted, so I have to take a detour through a public method. The result is: " + result);
    }
}
