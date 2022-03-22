package blackjack_statepattern.state;

import blackjack_statepattern.card.Card;
import blackjack_statepattern.card.Cards;

public interface State {
    State draw(Card card);

    State stay();

    Cards cards();

    boolean isFinished();

    boolean isReady();

    int score();

    double profit(State state, double money);
}