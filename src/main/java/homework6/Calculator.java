/*@Author-Nino Kveseladze*/

package homework6;

public class Calculator {
    public double calculate(double a, double b, char op) {

        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    return Double.NaN;
                }
                return a / b;

            default:
                return Double.NaN;
        }
    }
}
