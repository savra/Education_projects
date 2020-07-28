package Part14.Lesson3;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    boolean selected;

    void rotateShape() {
        System.out.println(this + ".rotate()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle " + selected;
    }
}

class Square extends Shape {
    public String toString() {
        return "Square " + selected;
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle " + selected;
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid " + selected;
    }
}

public class Shapes {
    public static void main(String[] args)  {
      Shape rhomboid = new Rhomboid();

        Rhomboid rhomboid1 = (Rhomboid) rhomboid;
        Circle c;

        if (rhomboid instanceof Circle)
            c = (Circle) rhomboid;

        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList)
            shape.draw();

        for(Shape shape : shapeList) {
            if(shape instanceof Circle)
                continue;
            shape.rotateShape();
        }
    }
}
