package OOP.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceDemo {

    public static void main(String[] args){
        Cat cat = new Cat("Kasya", 5);
        Dog dog = new Dog(6);
        Elephant elephant = new Elephant();

       /* cat.makeSound();
        dog.makeSound();
        elephant.makeSound();
        */

        List<Soundable> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(elephant);

        List<Soundable> discotheque = Arrays.asList(cat, dog, elephant);

        AnimalSoundUtils.makeSounds(animals);
        AnimalSoundUtils.makeSounds(discotheque);
    }



}
