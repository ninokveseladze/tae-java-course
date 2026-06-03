/*@author ნინო კვესელაძე*/
package homework4;

public class SumOfDigits { public static void main(String[] args) {

    int year = 1996;
    int sum = 0;

    while (year > 0) {
        sum =sum+ year % 10;
        year = year / 10;
    }

    System.out.println("ციფრების ჯამი არის : " + sum);
}
}
