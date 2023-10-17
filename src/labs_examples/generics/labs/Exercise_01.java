package labs_examples.generics.labs;

import java.sql.SQLOutput;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01 {
    public static void main(String[] args) {
        MyGeneric<String, Double> myObj = new MyGeneric<>("See?", 55.5);
        MyGeneric<Integer, String> myObj2 = new MyGeneric<>(10, " kleine Jägermeister.");

        System.out.println(myObj.toString());
        System.out.println(myObj2.toString());
    }
}

class MyGeneric<T, U> {
    private T someThing;
    private U val;

    public MyGeneric(T someThing, U val) {
        this.someThing = someThing;
        this.val = val;
    }

    public T getSomeThing() {
        return someThing;
    }

    public void setSomeThing(T someThing) {
        this.someThing = someThing;
    }

    public U getVal() {
        return val;
    }

    public void setVal(U val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "someThing=" + someThing +
                ", val=" + val +
                '}';
    }
}