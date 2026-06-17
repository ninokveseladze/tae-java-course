/*@Author-Nino Kveseladze*/
package homework9;

class Box<T> {

    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter
    public T get() {
        return value;
    }

    // Setter
    public void set(T value) {
        this.value = value;
    }
}

public class GenericBox {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + integerBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}