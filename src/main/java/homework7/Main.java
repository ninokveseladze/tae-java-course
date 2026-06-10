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
    }
}
