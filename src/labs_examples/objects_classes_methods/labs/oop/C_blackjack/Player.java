package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int playerFunds; //the amount of money they have
    int madeBet;

    Scanner input = new Scanner(System.in);

    public Player(){
        this.hand = new Hand();
    }

    public Player(String name, int playerFunds) {
        this.name = name;
        this.hand = new Hand();
        this.playerFunds = playerFunds;
    }

    public int getHandValue() {
        return hand.returnHandScore();
    }

    public void printHandValue() {
        System.out.println(this.name + "'s hand value: " + this.hand.returnHandScore());
    }

    public Boolean doYouWantAnotherCard() {
            System.out.print("Do you want another card? (y/n): ");
            String anotherCard = input.next();
        return anotherCard.equals("y") || anotherCard.equals("yes");
    }

    public void makeBet() {
        System.out.print("How much do you want to bet? ");
        this.madeBet = Integer.parseInt(input.nextLine());
    }
}
