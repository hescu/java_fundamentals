package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;

public class Table {
    ArrayList<Player> playersAtTable = new ArrayList<>();
    Scanner input = new Scanner (System.in);
    Dealer dealer;
    int maxBetAtTable;
    static int gamesPlayed = 0;

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
                p.playerFunds -= p.madeBet;
                dealer.gamesWon++;
                break;
            }
            System.out.println("The dealer's score: " + dealer.getHandValue());
            if (dealer.didDealerBust()) {
                System.out.println("The dealer busts.");
                p.gamesWon++;
                p.playerFunds += p.madeBet;
            } else {
                if (p.getHandValue() > dealer.getHandValue()) {
                    System.out.println(p.name + " won!");
                    p.playerFunds += p.madeBet;
                    p.gamesWon++;
                } else if (p.getHandValue() < dealer.getHandValue()) {
                    System.out.println(p.name + " lost");
                    p.playerFunds -= p.madeBet;
                    dealer.gamesWon++;
                } else {
                    System.out.println("It's a draw.");
                }
            }
            System.out.println(p.name + "'s funds: " + p.playerFunds);
        }
    }

    public void DoesPlayerWantToQuit(Player player) {
        System.out.println("Do you want to quit? (yes/no)");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("yes") || answer.equals("Yes")) {
            playersAtTable.remove(player);
        }
    }

    public void printGamesWon(Player player) {
        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Games won by dealer: " + dealer.gamesWon);
        System.out.println("Games won by " + player.name + ": " + player.gamesWon);
    }
}
