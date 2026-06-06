/*@author ნინო კვესელაძე*/
package homework4;

public class PatternPrinter {public static void main(String[] args) {

    String name = "ნინო";

    for (int i = 1; i <= name.length(); i++) {

        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }

        System.out.println();
    }


}
}
