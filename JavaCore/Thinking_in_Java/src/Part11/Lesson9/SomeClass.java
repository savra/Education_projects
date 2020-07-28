package Part11.Lesson9;

public class SomeClass {
    private String str;

    SomeClass(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "str='" + str + '\'' +
                '}';
    }
}
