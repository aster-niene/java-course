package OOP.interfaces;

public class Dog implements Soundable {
    int age;
    public Dog(int age) {
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Gau");
    }

    public void makeBark (){
        System.out.println("Гав! Я большая собака, во мне целых " + age + " лет");
    }
}
