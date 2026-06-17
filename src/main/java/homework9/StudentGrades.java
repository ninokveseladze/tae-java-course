/*@Author-Nino Kveseladze*/
package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGrades {

    static HashMap<String, List<Integer>> grades = new HashMap<>();

    public static double averageFor(String name) {

        List<Integer> scores = grades.get(name);

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.size();
    }

    public static void main(String[] args) {

        grades.put("Nino", new ArrayList<>(List.of(85, 92, 78, 90)));
        grades.put("Misho", new ArrayList<>(List.of(70, 65, 80, 75)));
        grades.put("Lali", new ArrayList<>(List.of(95, 98, 92, 100)));
        grades.put("Dato", new ArrayList<>(List.of(97, 97, 77, 87)));

        for (String student : grades.keySet()) {

            System.out.printf(
                    "%s: %s avg=%.2f%n",
                    student,
                    grades.get(student),
                    averageFor(student)
            );
        }
    }
}