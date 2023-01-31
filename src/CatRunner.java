import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<String> Cats = new ArrayList<String>();
        Cat cat1= new Cat("Mobey");
        Cat cat2= new Cat("Cheese");
        Cat cat3= new Cat("Pikles");
        Cats.add(String.valueOf(cat1));
        Cats.add(String.valueOf(cat2));
        Cats.add(String.valueOf(cat3));
        System.out.println(Cats);

        Cat cat4 = new Cat("Toby");
        Cat replacmentcat = Cats.set(2,Cats.get(3));
        System.out.println(Cats);
    }
}
