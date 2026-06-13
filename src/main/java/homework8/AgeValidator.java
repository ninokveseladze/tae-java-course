/*@Author-Nino Kveseladze*/
package homework8;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException {

        if (age < 0 || age > 150) {
            throw new InvalidAgeException("არასწორი ასაკი: " + age);
        }

        System.out.println("ასაკი სწორია: " + age);
    }

    public static void main(String[] args) {

        try {
            validate(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate(200);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
