/*@Author-Nino Kveseladze*/
package homework9;

import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> unique = new HashSet<>();



        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Unique: " + unique);
        System.out.println("Size: " + unique.size());

        System.out.println("Contains 3? " + unique.contains(3));
        System.out.println("Contains 10? " + unique.contains(10));
    }
}