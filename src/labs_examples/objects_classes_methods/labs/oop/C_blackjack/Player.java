package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int playerFunds; //the amount of money they have
    int madeBet;
    boolean wantsAnotherCard = true;
    boolean isDealer = false;

    Scanner scanner = new Scanner(System.in);

    public Player(String name, int playerFunds) {
        this.name = name;
        this.hand = new Hand();
        this.playerFunds = playerFunds;
    }

    public Player(String name, boolean isDealer) {
        this.name = name;
        this.hand = new Hand();
        this.isDealer = isDealer;
    }

    public int getHandValue() {
        return hand.handValue;
    }
    public boolean computerAI () {
        return this.hand.handValue < 16;
    }

    public Boolean DoYouWantAnotherCard() {
        if (!isDealer && wantsAnotherCard) {
            System.out.print("Do you want another card? (y/n): ");
            String anotherCard = scanner.next();
            if (anotherCard.equals("n") || anotherCard.equals("no")) {
                return false;
            }
        } else {
            if (!computerAI()) {
                return false;
            }
        }

        return true;
    }
}
