package lesson9;

public class Dogs extends Animal implements IAnimal {

    public Dogs(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String voice() {
        return "gaf-gaf";
    }
}
