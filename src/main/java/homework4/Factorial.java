/*@author ნინო კვესელაძე*/

package homework4;

public class Factorial { public static void main(String[] args) {

    int tve = 3;
    long factorial = 1;

    for (int i = 1; i <= tve; i++) {
        factorial *= i;
    }

    System.out.println(tve + "! = " + factorial);
}
}
