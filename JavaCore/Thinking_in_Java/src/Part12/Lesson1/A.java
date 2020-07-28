package Part12.Lesson1;

public class A {
    public static void main(String[] args) {
        try {
        throw new Exception("string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Iam here");
        }
    }
}
