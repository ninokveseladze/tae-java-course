/*Author-Nino Kveseladze*/
package homework7;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.println(s2.area());

        //დავალება #2
        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();

        //დავალება #4
        Drawable[] figures = {
                new Square(),
                new Triangle(),
                new Star()
        };

        for (Drawable N : figures) {
            N.draw();

            //დავალება #5
            Book N1 = new Book("Java Basics");
            Book N2 = new Book("Java Basics", "Nino");
            Book N3 = new Book("Java Basics", "Nino", 2025);

            System.out.println(N1);
            System.out.println(N2);
            System.out.println(N3);

            //დავალება #6
            new Car("Toyota").start();
            new Bike("Trek").stop();


            //დავალება #7

            Person[] people = {
                    new Person("ნინო", 30),
                    new Person("მიშო", 28),
                    new Person("რომა", 32),
                    new Person("მაშო", 6)
            };

            Arrays.sort(people);

            for (Person p : people) {
                System.out.println(p);}



        }
    }
}
