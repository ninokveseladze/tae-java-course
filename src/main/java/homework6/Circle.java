/*@Author-Nino Kveseladze*/

package homework6;

public class Circle extends Shape{
    public double radius;

    public Circle (double radius){
        this.radius=radius;

    }
@Override
public double area() {
    return Math.PI * radius * radius;
}
}
