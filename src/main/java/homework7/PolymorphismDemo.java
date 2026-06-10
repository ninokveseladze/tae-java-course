package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {

         Animal[] Animal =  {
                new Dog("Dora"),
                new Dog("Rex"),
                new Cat("Mimi"),
                new Cat("Lulu")
        };
        for (Animal a : Animal) {

            if (a instanceof Dog) {
                System.out.println("This is a Dog");
            } else if (a instanceof Cat) {
                System.out.println("This is a Cat");
            }

            a.makeSound();
            a.sleep();
            System.out.println();
        }
    }
}