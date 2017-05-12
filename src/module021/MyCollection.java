package module021;

import java.util.Arrays;

/**
 * Created by IGOR.LAZNIUK on 12.05.2017.
 */
public class MyCollection {

    private static int size = 0;
    private static Integer[] array = new Integer[size];


    public boolean add(Integer element) {
        size++;
        array = Arrays.copyOf(array, size);
        array[size-1] = element;
        return false;


    }

    @Override
    public String toString() {
        String string;
        string = "[ ";
        for (int i = 0; i < size; i++) {
            string = string + array[i] + " ";
        }
        string = string + "]";
        return string;
    }
}
