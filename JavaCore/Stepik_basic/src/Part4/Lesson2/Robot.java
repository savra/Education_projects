package Part4.Lesson2;

import Part3.Lesson3.Direction;

import java.util.Random;

public class Robot implements RobotConnection, RobotConnectionManager {
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

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean goodJob = false;
        for (int i = 0; i < 3; i++) {

            RobotConnection robotConnection = null;
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                goodJob = true;
                break;
            } catch (RobotConnectionException e4) {
            } finally {
                try {
                    robotConnection.close();
                } catch (Exception e) {
                }
            }
        }

        if (!goodJob)
            throw new RobotConnectionException("Error");
    }


    @Override
    public void moveRobotTo(int x, int y) {
        setX(x);
        setY(y);
        throw new RobotConnectionException("f");
    }

    @Override
    public void close() {
        throw new RobotConnectionException("2");
    }

    @Override
    public RobotConnection getConnection() {
        throw new RobotConnectionException("2");
        // return new Robot();
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
        RobotConnectionManager robotConnectionManager = new Robot();
        moveRobot(robotConnectionManager, 5, 5);
    }
}
