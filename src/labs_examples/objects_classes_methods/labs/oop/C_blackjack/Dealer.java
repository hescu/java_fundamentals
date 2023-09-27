package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Dealer extends Player{
    int gamesWon = 0;
    public boolean dealerWantsAnotherCard () {
        return this.hand.returnHandScore() < 16;
    }

    public boolean didDealerBust() {
        return this.getHandValue() > 21;
    }
}
