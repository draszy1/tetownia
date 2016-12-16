/**
 * Created by draszy1 on 16.12.2016.
 */
public class Refs {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        a = 4;

        System.out.println("BBBBBB: " + b);
    }
}
