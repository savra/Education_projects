package Part10.Lesson2;

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
