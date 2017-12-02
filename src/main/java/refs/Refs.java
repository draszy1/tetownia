package refs;

/**
 * Created by draszy1 on 16.12.2016.
 */
public class Refs {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = a;

        a = 4;

        System.out.println("BBBBBB: " + b);

        Refs refs = new Refs();

        Integer c = 5;
        refs.increase(c);

        System.out.println("CCCCC: " + c);

        Person person = new Person("Zenon", 50);
        Person person2 = person;
        refs.changeAge(person);

        System.out.println("Person: " + person2);
    }

    private void increase(Integer i) {
        i = 7;
    }

    private void changeAge(Person p) {
        p.setAge(100);
    }

}
