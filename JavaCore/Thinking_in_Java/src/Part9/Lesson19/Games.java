package Part9.Lesson19;

public class Games {
    public static void play(GameFactory factory) {
        Game g = factory.getGame();
        System.out.println("I play with " + g.getClass().getSimpleName() + " and i throwing " + g.throwing());
    }

    public static void main(String... args) {
        for (int i = 0; i < 5; i++)
            play(new CoinFactory());
        for (int i = 0; i < 5; i++)
            play(new CubeFactory());

    }
}
