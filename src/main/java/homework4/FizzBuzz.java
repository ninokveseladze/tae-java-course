/*@author ნინო კვესელაძე*/
package homework4;

public class FizzBuzz {
    public static void main(String[] args) {

        int age = 30;
        for (int i = 1; i <= age * 3; i++) {


            if
            (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
