package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.List;

public class Table {
    List<Player> PlayersAtTable = new ArrayList<>();

    public void removePlayerFromTable(Player player) {
        PlayersAtTable.remove(player);
    }

    public void AddPlayerToTable(Player player) {
        PlayersAtTable.add(player);
    }
}
