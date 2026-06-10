/*@Author-Nino Kveseladze*/
package homework7;

public abstract class Vehicle {

    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void stop() {
        System.out.println(brand + " stopped");
    }
}