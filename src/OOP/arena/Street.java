package OOP.arena;


import OOP.animal.Dog;
import OOP.animal.Mammal;

public class Street {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(); // Создаем объект зоопарк
        //List<Mammal> born = zoo.born();
        //System.out.println(born.size());
        Mammal[] anim = zoo.born(); // записываем в массив anim состоящий из млекопитающих значения, которые вернулись в методе born
        System.out.println(anim[1]);

        anim[0].makeSound(); // Каждый элемент массива млекопитающих может делать все то что умеет делать млекопитающее
        //anim[0].makeBark(); // Млекопитающее собака не умеет гавкать, т.к. млекопитающие не умеют гавкать
        anim[1].makeSound(); // Кошка модифицировала метод, и поэтому возвращает модифицированный ответ

        Mammal potetialDog = anim[0]; // Присваиваем переменной potetialDog, типа млекопетающее значение, хранящиеся в ячейке массива

       if(potetialDog instanceof Dog){ // Проверка того что эта ячейка действительно собака. Что-бы не побили.
           Dog dog = (Dog)potetialDog; // Переопределяем переменную млекопитающие в переменную собака
           dog.makeBark();
       }

    }
}
