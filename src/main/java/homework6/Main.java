/*@author-Nino Kveseladze*/
package homework6;
public class Main {
    public static void main (String[] args){
        //დავალება#1

        Person person1 = new Person("Nino",30,"kveseladze.nino@gmail.com");
        Person person2= new Person("რომა",23,"roma@gmail.com");
        System.out.println(person1.getName());
        person2.introduce();

        //დავალება#2

        BankAccount acc = new BankAccount("Nino",100);
        acc.deposit(50);
        System.out.println(acc.getBalance());

        //დავალება#3

        Counter c = new Counter();
        c.countTo(5);
        System.out.println(c.count);

        //დავალება#4

        new Dog("Rex").makeSound();

        //დავალება #5

        Rectangle r = new Rectangle(4, 5);
        System.out.println(r.area());

        Circle n = new Circle(3);
        System.out.println(n.area());


        // დავალება #6
        new Car("Toyota", 2020, 4).info();

    }


}





