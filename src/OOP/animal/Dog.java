package OOP.animal;

public class Dog extends Mammal {
    int age;
    public Dog(int temp, int w, int age) {
        super(temp, w);
        this.age = age;
    }

    public void makeBark (){
        System.out.println("Гав! Я большая собака, во мне целых " + weight + " килограмм и мне " + age + " лет");
    }
}
