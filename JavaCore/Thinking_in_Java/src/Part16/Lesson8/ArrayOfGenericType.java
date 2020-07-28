package Part16.Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfGenericType<T> {
    List<T> array; // 0K

    public ArrayOfGenericType( int size )
    {
        //! a rr a y = new T [ s iz e ] ; I l l e g a l
        array = new ArrayList<>(size) ; // "Неконтролируемое" предупреждение
    }

    public static void main(String[] args) {
        ArrayOfGenericType<Integer> arrayOfGenericType = new ArrayOfGenericType<>(6);
       // ArrayOfGenericType<int> Примитивные типы запрещены
    }
}
