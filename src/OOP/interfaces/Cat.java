package OOP.interfaces;

import java.io.Serializable;

public class Cat implements Soundable {

    int age;
    String name;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meaw! ");
    }
}
