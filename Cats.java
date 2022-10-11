package lesson9;

public class Cats extends Animal implements IAnimal {

    public Cats(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String voice() {
        return "may";
    }


}
