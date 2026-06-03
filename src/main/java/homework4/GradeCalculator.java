/*@author ნინო კვესელაძე*/
package homework4;

public class GradeCalculator {public static void main(String[] args) {

    int tve = 1;
    String grade;

    if (tve == 12) {
        grade = "A";
    } else if (tve >= 9 && tve <= 11) {
        grade = "B";
    } else if (tve >= 6 && tve <= 8) {
        grade = "C";
    } else if (tve >= 3 && tve <= 5) {
        grade = "D";
    } else {
        grade = "F";
    }

    System.out.println("შეფასება: " + grade);
}
}
