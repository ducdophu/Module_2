package _07_AbstractClass_and_Interface.thuchanh.Animal_Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal animal = new Chicken();
        System.out.println(animal.makeSound());

        animal = new Tiger();
        System.out.println(animal.makeSound());

    }
}
