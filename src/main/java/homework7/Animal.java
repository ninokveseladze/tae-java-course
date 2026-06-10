/*@Author-Nino Kveseladze*/
package homework7;

public abstract  class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    abstract void makeSound();
     void sleep (){
        System.out.println(name+" is sleeping");
    }
}
