/*@ Author-Nino Kveseladze*/
package homework9;

import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Nino");
        names.add("Misho");
        names.add("Dato");
        names.add("Lali");
        names.add("Roma");

        System.out.println("Size: " + names.size());
        System.out.println("First: " + names.get(0));
        System.out.println("Last: " + names.get(names.size() - 1));

        names.remove(2);

        System.out.println("Contains Misho? " + names.contains("Misho"));

        for (String name : names) {
            System.out.println(name);
        }
    }
}