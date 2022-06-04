package OOP.animal;

public class Cat extends Mammal {

    int age;
    String name;

    public Cat(String name, int temp, int weight, int age) {
        super(temp, weight);
        this.age = age;
        this.name = name;
    }

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }



    public String getName(){
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу, мне " + age + "лет. " + weight + " мой вес");
    }
}
