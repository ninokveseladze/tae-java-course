/*@Author Nino Kveseladze*/

package homework10;

import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("5 ლუწია? " + isEven.test(5));
        System.out.println("6 ლუწია? " + isEven.test(6));

        // Comparator Lambda
        Comparator<String> byLength = (a, b) -> a.length() - b.length();

        System.out.println(byLength.compare("Java", "Python"));
        System.out.println(byLength.compare("Cat", "Elephant"));
    }

}
