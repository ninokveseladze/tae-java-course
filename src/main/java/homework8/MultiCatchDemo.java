/*@Author-Nino Kveseladze*/
package homework8;

public class MultiCatchDemo {

        public static int processInput(String s) {
            try {
                int result = Integer.parseInt(s);

                int[] arr = {10, 20};

                return arr[result] / result;

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
                return 0;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
                return 0;

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
                return 0;
            }
        }

        public static void main(String[] args) {

            System.out.println("processInput(\"abc\") = " + processInput("abc"));

            System.out.println("processInput(\"0\") = " + processInput("0"));

            System.out.println("processInput(\"77\") = " + processInput("77"));
        }
    }