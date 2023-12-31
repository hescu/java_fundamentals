package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackJackController {
    public static void main(String[] args) {
        playBlackJack();
    }
    public static void playBlackJack() {
        Table table1 = new Table(10);
        table1.NewPlayerEnters();
        System.out.println("Let's play! Bet maximum: " + table1.maxBetAtTable + " $");
        Deck deck = new Deck();

        do {
            table1.dealer.hand = new Hand();

            for (Player p : table1.playersAtTable) {
                p.madeBet = 0;
                p.makeBet();
            }

            // Dealers turn
            do {
                deck.deal(table1.dealer);
                if (table1.dealer.hand.cards.size() == 1) {
                    System.out.println("Dealer got " + table1.dealer.hand.cards.get(0).suit + " " + table1.dealer.hand.cards.get(0).cardValue + " " + table1.dealer.hand.cards.get(0).cardName);
                }
            } while (table1.dealer.dealerWantsAnotherCard());


            for (int i = 0; i < table1.playersAtTable.size(); i++) {
                Player p = table1.playersAtTable.get(i);
                p.hand = new Hand();
                do {
                    System.out.println("Player " + p.name + " gets: " + deck.cards.get(0).suit + " " + deck.cards.get(0).cardValue + " " + deck.cards.get(0).cardName);
                    deck.deal(p);
                    p.printHandValue();
                    if (table1.checkIfBusted(p)) {
                        break;
                    }
                } while (p.doYouWantAnotherCard());
            }

            System.out.println("The game has ended. The Score:");
            for (Player p : table1.playersAtTable) {
                System.out.println(p.name + ": " + p.hand.returnHandScore());
            }
            table1.checkForWinner();

            for (int i = 0; i < table1.playersAtTable.size(); i++) {
                table1.printGamesWon(table1.playersAtTable.get(i));
                table1.DoesPlayerWantToQuit(table1.playersAtTable.get(i));
            }
        } while (!table1.playersAtTable.isEmpty());
    }
}
