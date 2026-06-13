/*@Author-Nino Kveseladze*/
package homework8;

public class ArrayReader {
    public static int readSafe(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("არასწორი ინდექსი: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println("arr[2] = " + readSafe(arr, 2));

        System.out.println("arr[10] = " + readSafe(arr, 10));
    }

}
