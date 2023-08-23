package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> listOfGuests = new ArrayList<String>() {{
            add("Hendrik");
            add("Chris");
            add("Dennis");
            add("Lisa");
            add("Krissi");
        }};

        for (String name : listOfGuests) {
            System.out.println(name + " is coming to the party!");
        }

        System.out.println("Is Stefan coming to the party?");
        if (listOfGuests.contains("Stefan")) {
            System.out.println("Yes!");
        } else {
            System.out.println("Sadly, he is not... :(");
        }
    }
}
