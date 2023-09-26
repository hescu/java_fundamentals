package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        populateDeck();
        shuffleDeck();
    }

    public void populateDeck() {
        int cardCounter = 0;
        for (int i = 0; i < 4; i++) {
            int cardValue = 1;
            int cardValueName = 1;
            for (int x = 0; x < 13; x++) {
                cards.add(cardCounter, new Card(i, cardValue, getCardName(cardValueName)));
                if (cardValue < 10) {
                    cardValue++;
                }
                cardCounter++;
                cardValueName++;
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public String getCardName(int cardValueName) {
        if (cardValueName > 1 && cardValueName <= 10) {
            return String.valueOf(cardValueName);
        }
        switch (cardValueName) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "";
        }
    }

    public void deal(Player player) {
        player.hand.cards.add(cards.remove(0));
    }
}
