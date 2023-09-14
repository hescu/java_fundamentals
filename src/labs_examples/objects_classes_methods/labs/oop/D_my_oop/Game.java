package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> playersInGame;
    int bigBlind, smallBlind;
    int potValue;
    Deck deck = new Deck();
    List<Card> FlopTurnRiver = new ArrayList<>();
    public Game(List<Player> playersInGame, int bigBlind, int smallBlind) {
        this.playersInGame = playersInGame;
        this.bigBlind = bigBlind;
        this.smallBlind = smallBlind;
        this.potValue = 0;
    }

    public void dealCards() {
        for (Player player : playersInGame) {
            player.hand.add(deck.deckOfCards.remove(0));
            player.hand.add(deck.deckOfCards.remove(0));
        }
        for (int i = 0; i < 5; i++) {
            FlopTurnRiver.add(deck.deckOfCards.remove(0));
        }
    }
}
