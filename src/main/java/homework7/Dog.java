/*@Author-Nino Kveseladze*/
package homework7;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Bark");

    }
}
