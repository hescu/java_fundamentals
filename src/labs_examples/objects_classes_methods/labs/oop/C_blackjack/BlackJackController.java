package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackJackController {
    public static void main(String[] args) {
        playBlackJack();
    }
    public static void playBlackJack() {
        Table table1 = new Table(10);
        table1.NewPlayerEnters();
        System.out.println("Let's play!");
        Deck deck = new Deck();

        for (int i = 0;i < table1.playersAtTable.size(); i++) {
            Player p = table1.playersAtTable.get(i);
            table1.playersInGame.add(p);
            do {
                deck.deal(p);
                if (table1.checkIfBusted(p)) {
                    break;
                }
            } while ( p.DoYouWantAnotherCard());
        }

        System.out.println("The game has ended. The Score:");
        for (Player p : table1.playersAtTable) {
            System.out.println(p.name + ": " + p.hand.returnHandScore());
        }
        table1.checkForWinner();
    }
}
