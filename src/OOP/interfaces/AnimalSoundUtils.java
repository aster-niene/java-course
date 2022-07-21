package OOP.interfaces;

import java.util.List;

public class AnimalSoundUtils {
    public static void makeSounds(List<Soundable> animals){
        for (Soundable animal: animals) {
            animal.makeSound();
        }
    }
}
