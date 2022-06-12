package OOP.nested;

import OOP.animal.Cat;

public class Human {
    // поля класса, атрибуты, состояние
    private int age;
    private String name;
    private Pocket pocket = new Pocket();

    public Human() {
    }



    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age, String name, Pocket pocket) {
        this.age = age;
        this.name = name;
        this.pocket = pocket;
    }

    //методы класса, поведение
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public Pocket getPocket(){
        return pocket;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPocket(Pocket pocket){
        this.pocket = pocket;
        System.out.println("Human.setPocket: Now I have a pocket!");
    }
}
