package blackjack.domain.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CardTest {
    @Test
    @DisplayName("카드가 만들어졌으면, true를 리턴한다.")
    void createTest() {
        Card card = Card.of(1);

        assertThat(card).isInstanceOf(Card.class);
    }

    @Test
    @DisplayName("중복되지 않는 카드를 53장 받으려고 하면, 예외가 발생한다.")
    void cardOverDrawThrowsException() {
        assertThatThrownBy(
                () -> {
                    for (int i = 1; i <= 53; i++) Card.of(i);
                }
        ).isInstanceOf(IndexOutOfBoundsException.class);
    }
}