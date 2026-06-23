/*@Author Nino Kveseladze*/
package homework10;
import java.util.List;
import java.util.stream.Collectors;
public class MapStream {
    public static void main(String[] args) {

        List<String> names = List.of("Nino", "Dato", "Misho");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(upperNames);
        System.out.println(lengths);
    }
}
