/*Author-Nino Kveseladze*/
package homework7;

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
        }
    }
}
