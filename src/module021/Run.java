package module021;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by IGOR.LAZNIUK on 12.05.2017.
 */
public class Run {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.add(5);
        myCollection.add(5);
        System.out.println(myCollection.toString());
    }
}
