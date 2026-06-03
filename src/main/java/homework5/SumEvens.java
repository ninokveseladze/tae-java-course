/*@author ნინო კვესელაძე*/
package homework5;

public class SumEvens {

    public static int sumEvens(int from, int to) {

        int sum = 0;

        for (int i = from; i <= to; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        return sum;

    }

    public static void main(String[] args) {


        int age = 30;

        int result = sumEvens(1, age * 2); // 1 → 60

        System.out.println("ჯამი: " + result);


    }
}
