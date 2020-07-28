package Part9.Lesson19;

public class Cube implements Game {
    @Override
    public int throwing() {
        return 1 + rn.nextInt(6);
    }
}

class CubeFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Cube();
    }
}
