package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Poker {

    public static void main(String[] args) {
        Table table1 = new Table();
        Player player1 = new Player("Harvey", 400);
        Player player2 = new Player("Steven", 400);
        Player player3 = new Player("Amberly", 400);
        table1.AddPlayerToTable(player1);
        table1.AddPlayerToTable(player2);
        table1.AddPlayerToTable(player3);
        Game game1 = new Game(table1.PlayersAtTable, 10, 5);
        game1.dealCards();

        for (Player player : table1.PlayersAtTable) {
            System.out.println(player.name + ":");
            System.out.println(player.hand.get(0).suit + " " + player.hand.get(0).value + " | " + player.hand.get(1).suit + " " + player.hand.get(1).value);
        }
        System.out.println("Flop Turn River");
        for (Card c : game1.FlopTurnRiver) {
            System.out.print(c.suit + " " + c.value + " | ");
        }
    }
}
