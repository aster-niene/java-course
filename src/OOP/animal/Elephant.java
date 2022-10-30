package OOP.animal;

public class Elephant extends Mammal {

    protected String color = "white";
    public Elephant(int temp, int w) {
        super(temp, w);
    }

    private void testVisibilite (){
        System.out.println(temperature);
        makeSound();
        System.out.println(color);
    }


    public String getColor() {
        return color;
    }

    @Override
    public void printYourColor() {
        System.out.println("In Elephant color");
        System.out.println(color);
    }

    public static void main (String[] args){
        Elephant elephant = new Elephant(25, 25);
        elephant.testVisibilite();
        Mammal mam = (Mammal) elephant;
        System.out.println("Mammal has color: " );
        mam.printYourColor();

        elephant.printYourColor();

    }
}
