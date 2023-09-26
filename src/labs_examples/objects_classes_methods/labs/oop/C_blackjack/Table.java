package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;

public class Table {
    ArrayList<Player> playersAtTable = new ArrayList<>();
    Scanner input = new Scanner (System.in);
    Dealer dealer;
    int maxBetAtTable;

    public Table(int maxBetAtTable) {
        this.maxBetAtTable = maxBetAtTable;
        this.dealer = new Dealer();
    }

    public void NewPlayerEnters() {
        System.out.println("So, you want to play Blackjack? Please enter your name and the amount of money to play with: ");
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter amount of money to play with: ");
        int money  = Integer.parseInt(input.nextLine());
        playersAtTable.add(new Player(name, money));
    }

    public boolean checkIfBusted (Player player) {
        return player.getHandValue() > 21;
    }

    public void checkForWinner() {
        for (Player p : playersAtTable) {
            if (checkIfBusted(p)) {
                System.out.println(p.name + " lost!");
                break;
            }
            System.out.println("The dealer's score: " + dealer.getHandValue());
            if (dealer.didDealerBust()) {
                System.out.println("The dealer busts.");
            } else {
                if (p.getHandValue() > dealer.getHandValue()) {
                    System.out.println(p.name + " won!");
                } else if (p.getHandValue() < dealer.getHandValue()) {
                    System.out.println(p.name + " lost");
                } else {
                    System.out.println("It's a draw.");
                }
            }
        }
    }

    public void DoesPlayerWantToContinue(Player player) {
        System.out.println("Do you want to continue playing? (yes/no)");
        String answer = input.next();
        if (answer.equals("no") || answer.equals("No") || answer.equals("n")) {
            playersAtTable.remove(player);
        }
    }
}
