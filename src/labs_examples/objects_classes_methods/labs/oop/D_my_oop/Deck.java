package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deckOfCards;

    public Deck () {
        this.deckOfCards = populateDeck();
        shuffleDeck();
    }

    public static List<Card> populateDeck() {
        List<Card> deck = new ArrayList<>();

        char[] suitArray = new char[]{'♠', '♦', '♥', '♣'};
        String[] values = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (char suit : suitArray) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }
        return deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }
}
