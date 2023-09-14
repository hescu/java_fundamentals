package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    List<Card> hand = new ArrayList<>();
    int playerChips;
    int chipsInPot;

    public Player(String name, int playerChips) {
        this.name = name;
        this.playerChips = playerChips;
    }
}
