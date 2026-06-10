/*@author ნინო კვესელაძე*/
package homework5;

public class DigitCounter {
    public static int countDigits(int n) {

        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int birthYear = 1996;

        System.out.println(countDigits(birthYear));
    }
}
