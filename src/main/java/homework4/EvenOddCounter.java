/*@author ნინო კვესელაძე*/
package homework4;

public class EvenOddCounter { public static void main(String[] args) {

    int year = 1996;


    int boloOriCipri = year % 100;

    int luwi = 0;
    int kenti = 0;

    for (int i = 1; i <= boloOriCipri; i++) {

        if (i % 2 == 0) {
            luwi++;
        } else {
            kenti++;
        }
    }

    System.out.println("ლუწი: " + luwi);
    System.out.println("კენტი: " + kenti);
}
}
