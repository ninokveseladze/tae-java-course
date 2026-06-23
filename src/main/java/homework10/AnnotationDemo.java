/*Author Nino Kveseladze0.*/package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {

    @Author(name = "Nino")
    public void firstMethod() {
    }

    @Author(name = "Misho")
    public void secondMethod() {
    }

    public static void main(String[] args) {

        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {

                Author author = method.getAnnotation(Author.class);

                System.out.println(
                        method.getName() + " -> " + author.name()
                );
            }
        }
    }
}