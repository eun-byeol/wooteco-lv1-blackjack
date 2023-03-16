package blackjack.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import blackjack.domain.participant.player.BetAmount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BetAmountTest {
    @DisplayName("금액을 받아 생성할 수 있다.")
    @Test
    void createByInteger() {
        //given
        int amount = 10000;
        //when
        final var betAmount = new BetAmount(amount);
        //then
        assertThat(betAmount).isInstanceOf(BetAmount.class);
    }

    @DisplayName("최소 베팅금액을 넘지 않으면 예외가 발생한다.")
    @Test
    void throwExceptionWhenBetAmountIsLowerThanMin() {
        //given
        int amount = 9000;
        //when
        //then
        assertThatThrownBy(() -> new BetAmount(amount))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("최대 베팅금액을 넘으면 예외가 발생한다.")
    @Test
    void throwExceptionWhenBetAmountIsHigherThanMax() {
        //given
        int amount = 120000;
        //when
        //then
        assertThatThrownBy(() -> new BetAmount(amount))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("베팅 금액이 생성되면 멤버변수로 해당하는 값의 money를 가진다.")
    @Test
    void haveMoney() {
        //given
        int amount = 20000;
        //when
        BetAmount betAmount = new BetAmount(amount);
        //then
        assertThat(betAmount).hasFieldOrPropertyWithValue("amount", new Money(amount));
    }
}