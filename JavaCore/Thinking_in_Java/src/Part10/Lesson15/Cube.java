package Part10.Lesson15;

public class Cube implements Game {
    @Override
    public int throwing() {
        return 1 + rn.nextInt(6);
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Cube();
        }
    };
}
