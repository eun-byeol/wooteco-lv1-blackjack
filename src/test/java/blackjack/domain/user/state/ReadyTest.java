package blackjack.domain.user.state;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.domain.card.Card;
import blackjack.domain.card.Denomination;
import blackjack.domain.card.Suit;

class ReadyTest {

    @Test
    @DisplayName("카드를 두번 뽑으면 히트 상태가 된다.")
    public void testHit() {
        // given
        State state = new Ready();
        // when
        state = state.hit(new Card(Suit.CLOVER, Denomination.JACK));
        state = state.hit(new Card(Suit.CLOVER, Denomination.TEN));
        // then
        assertThat(state).isInstanceOf(Hit.class);
    }

    @Test
    @DisplayName("뽑은 두장의 끗수 합이 21이면 블랙잭 상태가 된다.")
    public void testBlackjack() {
        // given
        State state = new Ready();
        // when
        state = state.hit(new Card(Suit.CLOVER, Denomination.ACE));
        state = state.hit(new Card(Suit.CLOVER, Denomination.TEN));
        // then
        assertThat(state).isInstanceOf(BlackJack.class);
    }

    @Test
    @DisplayName("스테이를 시도하면 예외를 던진다.")
    public void throwsExceptionWhenTryingToStay() {
        // given & when
        State state = new Ready();

        // then
        assertThatExceptionOfType(IllegalStateException.class)
            .isThrownBy(() -> state.stay());
    }
}