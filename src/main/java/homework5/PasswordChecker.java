
/*@author ნინო კვესელაძე*/
package homework5;

public class PasswordChecker { public static boolean isStrong(String password) {
    boolean hasDigit = false;
    boolean hasUpper = false;

    for (int i = 0; i < password.length(); i++) {
        char letter = password.charAt(i);

        if (Character.isDigit(letter)) {
            hasDigit = true;
        }

        if (Character.isUpperCase(letter)) {
            hasUpper = true;
        }
    }

    return password.length() >= 8 && hasDigit && hasUpper;
}

    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));   // true
        System.out.println(isStrong("hello"));      // false
        System.out.println(isStrong("HELLO123"));   // true
    }


}
