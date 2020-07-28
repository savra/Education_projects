package Part9.Lesson19;

import java.util.Random;

public class Coin implements Game {
    @Override
    public int throwing() {
        return 1 + rn.nextInt(2);
    }
}

class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}
