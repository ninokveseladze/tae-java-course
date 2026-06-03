/*@author ნინო კვესელაძე*/
package homework4;

public class PrimeCheck {
    public static void main(String[] args) {

        int age = 70;
        boolean isPrime = true;

        if (age < 2) {
            isPrime = false;
        } else {

            for (int i = 2; i <= age / 2; i++) {

                if (age % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("მარტივია");
        } else {
            System.out.println("არ არის მარტივი");
        }
    }

}
