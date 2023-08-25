package labs_examples.objects_classes_methods.labs.methods;

import javax.swing.plaf.metal.MetalTheme;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    int xxx = 666;
    public static void main(String[] args) {
        String stringo = "Herberto";
        int[] testArray = {-4, 5, 66, 8374, -3452, 200};
        ArrayList<Integer> resultArrayList;
        String[] someNames = {"Hendrik", "Peter", "Josh", "Xi", "Gerhard", "Norm", "Geraldine", "Jaqueline"};

        //1
        Square(14);
        Square(55.5);
        Square(213233L);
        // 2
        MethodTraining newObj = new MethodTraining();
        int num = 1234;
        System.out.println("Before calling the method: " + num + "  " + newObj.xxx);
        changeValue(num, newObj);
        System.out.println("After calling the method: " + num + "  " + newObj.xxx);
        //3
        System.out.println("The largest number is: " + largestNumber(3.45, 6, 797, 43.9, 4234.77));
        // 4
        System.out.println("Number of vowels in " + stringo + " >>> " + countConsonants(stringo));
        // 5
        isPrime(65);
        //6
        System.out.println("The lowest and highest numbers in the array are: " + Arrays.toString(returnHighestLowestNum(testArray)));
        // 7
        resultArrayList = divisibleNums(100, 4, 5);
        System.out.println("Länge der ArrayList: " + resultArrayList.size());
        //8
        reverseArray(someNames);
    }

    // 1) Demonstrate method overloading in this class
    public static void Square (int num){
        int square = num * num;
        System.out.println("Method with integer Argument Called:" + square);
    }
    public static void Square (double num)
    {
        double square = num * num;
        System.out.println("Method with double Argument Called:" + square);
    }
    public static void Square (long num)
    {
        long square = num * num;
        System.out.println("Method with long Argument Called:" + square);
    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void changeValue(int x, MethodTraining obj) {
        x++;
        obj.xxx++;
        System.out.println("Value inside the method: " + x + "  " + obj.xxx);
    }


    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static double largestNumber(double... args) {
        double largestNum = 0;
        for (double num : args) {
            System.out.print(num + " | ");
            if (num > largestNum) {
                largestNum = num;
            }
        }
        return largestNum;
    }
    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String str) {
        int counter = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                if (str.charAt(i) == vowel) {
                    counter++;
                }
            }
        }
        return counter;
    }
    // 5) Write a method that will determine whether a number is prime
    public static void isPrime(int num) {
        if (num != 0) {
            boolean flag = false;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + " is not a prime number.");
            } else {
                System.out.println(num + " is a prime number.");
            }
        }
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    // which is passed in as an argument
    public static int[] returnHighestLowestNum (int[] arr) {
        int[] resultArr = {0, 0};
        for (int num : arr) {
            if (num < resultArr[0]) {
                resultArr[0] = num;
            }
            if (num > resultArr[1]) {
                resultArr[1] = num;
            }
        }
        return resultArr;
    }

    /* 7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    length of the returned list */

    public static ArrayList<Integer> divisibleNums(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int i = 1; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                resultArray.add(i);
            }
        }
        return resultArray;
    }

    /* 8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
 */
    public static void reverseArray (String[] stringArr) {
        String temp;
        for (int i = 0; i < stringArr.length / 2; i++) {
            temp = stringArr[i];
            stringArr[i] = stringArr[stringArr.length - i -1];
            stringArr[stringArr.length - i -1] = temp;
        }
        for (String str : stringArr) {
            System.out.print(str + " ");
        }
    }

}