package blackjack;

import blackjack.controller.GameController;

public final class Application {
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.run();
    }
}
