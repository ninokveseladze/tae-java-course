/*@Author-Nino Kveseladze*/

package homework6;

public class Car extends Vehicle{

    public int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void info() {
        System.out.println(brand + " " + year + ", " + doors + " doors");
    }


}
