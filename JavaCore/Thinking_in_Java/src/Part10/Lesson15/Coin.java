package Part10.Lesson15;

import Part10.Lesson15.Game;
import Part10.Lesson15.GameFactory;

public class Coin implements Game {
    @Override
    public int throwing() {
        return 1 + rn.nextInt(2);
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };

}
