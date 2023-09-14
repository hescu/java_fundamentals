package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        this.cards = new Card[52];
        populateDeck();
        usedCards = new ArrayList<>();
    }

    public void populateDeck() {
        int cardCounter = 0;
        for (int i = 0; i < 4; i++) {
            int cardValue = 1;
            int cardValueName = 1;
            for (int x = 0; x < 13; x++) {
                this.cards[cardCounter] = new Card(i, cardValue, getCardName(cardValueName));
                if (cardValue < 10) {
                    cardValue++;
                }
                cardCounter++;
                cardValueName++;
            }
        }
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
        Random random = new Random();
        int randomNum = 0;
        if (this.cards != null) {
            do randomNum = random.nextInt(52); while (usedCards.contains(randomNum));
            player.hand.cards.add(this.cards[randomNum]);
            usedCards.add(randomNum);
        }
        player.hand.returnHandScore();
        if (!player.isDealer || player.hand.cards.size() <= 1) {
            printCardsDealt(randomNum, player);
        }
    }

    public void printCardsDealt(int i, Player p) {
        System.out.println("Player " + p.name + " got " + cards[i].suit + " " + cards[i].cardValue + " " + cards[i].cardName);
        System.out.println("Player " + p.name + " hand value: " + p.hand.returnHandScore());
    }
}
