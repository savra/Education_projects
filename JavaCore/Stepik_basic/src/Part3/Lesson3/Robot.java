package Part3.Lesson3;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.logging.Formatter;
import java.util.zip.DeflaterInputStream;

public class Robot {
    private int x;
    private int y;
    private Direction direction;
    private final Direction[] directions = new Direction[]{Direction.DOWN, Direction.LEFT, Direction.RIGHT, Direction.UP};
    Random random = new Random();

    public Robot() {
        x = random.nextInt(10);
        y = random.nextInt(10);
        direction = directions[random.nextInt(4)];
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (direction) {
            case LEFT:
                direction = Direction.DOWN;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (direction) {
            case LEFT:
                direction = Direction.UP;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (direction) {
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case RIGHT:
                x++;
                break;
            case DOWN:
                y--;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT)
                robot.turnRight();
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT)
                robot.turnRight();
        }
        while (robot.getX() != toX)
            robot.stepForward();

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP)
                robot.turnRight();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN)
                robot.turnRight();
        }
        while (robot.getY() != toY)
            robot.stepForward();
    }

    public static void main(String... args) {
        Robot testRobot = new Robot();
        Robot.moveRobot(testRobot, 5, 2);
        System.out.println(String.format("X = %1d Y = %2d", testRobot.getX(), testRobot.getY()));
    }
}
