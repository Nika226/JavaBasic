package lesson88;

import lesson88.Cat;

/**
 * Java Basic. Home work #88
 *
 *@author Veronika
 *@todo 28.09.2022
 *@date 06-10.10-2022
 *
 */
public class DomZadanie88 {
    public static void main(String[] args) {
        Cat cat = new Cat("Patrik", "wite", 4, 1);
        System.out.println(cat);
        System.out.println(cat.voice());

        //Cat cat1 = new Cat("Nidls", "broun", 6);
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println("Tray to play: " +  cat.play());
        cat.feed();
        System.out.println("Tray to play: " +  cat.play());
        cat.feed();
        System.out.println("Tray to jump: " +  cat.jump(1));
        cat.feed();
        System.out.println("Tray to jump: " +  cat.jump(2));
    }
}


