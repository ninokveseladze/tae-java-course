package homework6;

public class Runner {
    public static void main (String[] args){
        Person person1 = new Person("Nino",30,"kveseladze.nino@gmail.com");
        Person person2= new Person("რომა",23,"roma@gmail.com");
        System.out.println(person1.getName());
        person2.introduce();
    }
}
