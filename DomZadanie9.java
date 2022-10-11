import lesson9.Animal;
import lesson9.Cats;
import lesson9.Dogs;
import lesson9.IAnimal;

/**
 * Java Basic. Home work #88
 *
 *@author Veronika
 *@todo 05.10.2022
 *@date 06-11.10-2022
 *
 */

public class DomZadanie9 {
    public static void main(String[] args) {
        Cats cat = new Cats("Patrik", "white", 4);
        Dogs dog = new Dogs("Olaf", "black", 2);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
        System.out.println(cat);
        System.out.println(cat.voice());

    }

}
