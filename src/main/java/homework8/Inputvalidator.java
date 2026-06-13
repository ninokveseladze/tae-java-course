/*@Author-Nino Kveseladze*/
package homework8;

public class Inputvalidator {
    public static int processAge(String input)
            throws NumberFormatException, IllegalArgumentException {

        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("ასაკი არ შეიძლება იყოს უარყოფითი");
        }

        return age * 12;
    }

    public static void main(String[] args) {

        try {
            System.out.println(processAge("25"));

        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: არ არის რიცხვი");

        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }


        try {
            System.out.println(processAge("-5"));

        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: არ არის რიცხვი");

        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }


        try {
            System.out.println(processAge("abc"));

        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: არ არის რიცხვი");

        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }
    }
}
