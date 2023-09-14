package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;

public class Table {
    ArrayList<Player> playersAtTable = new ArrayList<>();
    ArrayList<Player> playersInGame = new ArrayList<>();
    Scanner input = new Scanner (System.in);
    Player dealer;
    int maxBetAtTable;

    public Table(int maxBetAtTable) {
        this.maxBetAtTable = maxBetAtTable;
        this.dealer = new Player("Dealer", true);
        this.playersAtTable.add(dealer);
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
        if (player.isDealer && player.hand.handValue > 21) {
            System.out.println("The Dealer busts. All players win!");
            return false;
        } else if (!player.isDealer && player.getHandValue() > 21) {
          //  playersInGame.remove(player);
          //  playersAtTable.remove(player);
            return true;
        }

        return false;
    }
    public void checkForWinner() {
        if (playersInGame.size() > 1) {
            for (Player p : playersInGame) {
                if (!p.isDealer && p.getHandValue() > playersInGame.get(0).getHandValue()) {
                    System.out.println(p.name + " won!");
                } else if (!p.isDealer && p.getHandValue() == playersInGame.get(0).getHandValue()) {
                    System.out.println("It's a draw.");
                } else if (!p.isDealer && p.getHandValue() < playersInGame.get(0).getHandValue()) {
                    System.out.println(p.name + " lost.");
                }
            }
        } else {
            System.out.println("The dealer wins.");
        }
    }

    public void DoesPlayerWantToContinue(Player player) {
        System.out.println("Do you want to continue playing? (yes/no)");
        String answer = input.next();
        if (answer.equals("no") || answer.equals("No") || answer.equals("n")) {
            playersAtTable.remove(player);
        }
    }

    public void Betting(Player player) {
        System.out.print("How much do you want to bet? ");
        player.madeBet = Integer.parseInt(input.nextLine());
    }
}
