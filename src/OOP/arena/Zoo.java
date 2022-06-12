package OOP.arena;

import OOP.animal.Cat;
import OOP.animal.Dog;
import OOP.animal.Elephant;
import OOP.animal.Mammal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 38, 4, 5);
        cat.makeSound();

        Mammal mammal = new Mammal(20, 9);
        mammal.makeSound();
    }

    public Mammal[] born(){
        Dog dog = new Dog(37, 2, 1);
        Cat cat = new Cat("Cat",37, 1, 1);
        Elephant elephant = new Elephant(30, 10);
        Mammal[] animals = new Mammal[3]; // Создаем массив элементов класса Mammal
        animals[0] = dog; // назначаем элементам массива созданные ранее объекты
        animals[1] = cat;
        animals[2] = elephant;

        //List<Mammal> animals = new ArrayList<>(); // можно (лучше) использовать списки, вместо массива
        //animals.add(dog);
        //animals.add(cat);
        //animals.add(elephant);
        return animals; // Возвращаем методу значения из массива

    }

}
