package labs_examples.static_nonstatic.labs;

public class ClassA {
    public static void main(String[] args) {
//        1) A static method calling another static method in the same class
//        2) A static method calling a non-static method in the same class
//        3) A static method calling a static method in another class
//        4) A static method calling a non-static method in another class
        staticMethod();
//        5) A non-static method calling a non-static method in the same class
//        6) A non-static method calling a non-static method in another class
//        7) A non-static method calling a static method in the same class
        ClassA obj = new ClassA();
        obj.nonStaticMethod();
//        8) A non-static method calling a static method in another class
        obj.anotherNonStaticMethod();
    }
    public static void staticMethod() {
        anotherStaticMethod();
        ClassA obj = new ClassA();
        obj.nonStaticMethod();
        ClassB.BigB();
        ClassB objB = new ClassB();
        objB.tooBig2B();
    }
    public static void anotherStaticMethod() {
        System.out.println("I am anotherStaticMethod.");
    }
    public void nonStaticMethod() {
        System.out.println("I am a non-static method, hurrah!");
        anotherStaticMethod();
        ClassB objB = new ClassB();
        objB.tooBig2B();
        anotherStaticMethod();
    }
    public void anotherNonStaticMethod() {
        System.out.println("I am another non-static method, yikes!");
        ClassB.BigB();
    }
}
