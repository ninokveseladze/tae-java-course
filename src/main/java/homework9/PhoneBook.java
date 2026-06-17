/*@ Author-Nino Kveseladze*/
package homework9;

import java.util.HashMap;

public class PhoneBook {

    public static String findPhone(HashMap<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "არ მოიძებნა";
    }

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Nino", "555373727");
        phoneBook.put("Misho", "5553727579");
        phoneBook.put("Dato", "5978275557");
        phoneBook.put("Lali", "66576798975");

        System.out.println("Misho: " + findPhone(phoneBook, "Misho"));
        System.out.println("Roma: " + findPhone(phoneBook, "Roma"));

        System.out.println("\nPhone Book:");
        for (String key : phoneBook.keySet()) {
            System.out.println(key + " -> " + phoneBook.get(key));
        }
    }
}