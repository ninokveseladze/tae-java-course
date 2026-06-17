/*@Author-Nino Kveseladze*/
package homework9;

import java.util.ArrayList;
import java.util.List;

public class ListUtilities {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Nino");
        names.add("Misho");
        names.add("Dato");

        System.out.println("First String: " + getFirst(names));
        printList(names);

        System.out.println();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("First Integer: " + getFirst(numbers));
        printList(numbers);
    }
}