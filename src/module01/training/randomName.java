package module01.training;

/**
 * Created by IGOR.LAZNIUK on 19.04.2017.
 */
public class randomName {
    public static void main(String[] args) {

        System.out.println(nameGenerator());
        System.out.println(Math.random());
    }

    static String nameGenerator() {
        return (char)(98 + Math.random() * 25)+"@gmail.com";
    }
}
