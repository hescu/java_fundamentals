package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char[] suitArray = new char[]{'♠', '♦', '♥', '♣'};
    char suit;
    String cardName;
    int cardValue;

    public Card(int suit, int cardValue, String cardName) {
        this.suit = suitArray[suit];
        this.cardValue = cardValue;
        this.cardName = cardName;
    }
}
