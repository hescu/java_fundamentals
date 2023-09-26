package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.*;
import java.util.ArrayList;

public class Hand {
    List<Card> cards = new ArrayList<>();

    public int returnHandScore() {
        int score = 0;
        for (Card c : cards) {
            score += c.cardValue;
        }
        return score;
    }
}




