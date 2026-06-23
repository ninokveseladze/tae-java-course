/*@Author Nino Kveseladze*/
package homework10;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {

        List<String> names = List.of("Nino", "Dato", "Lali");

        names.forEach(System.out::println);

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upperNames);

        List<String> numbersAsString = List.of("1", "2", "3");

        List<Integer> numbers = numbersAsString.stream()
                .map(Integer::parseInt)
                .toList();

        System.out.println(numbers);
    }
}
