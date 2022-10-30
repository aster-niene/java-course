package OOP.animal;

public  class Mammal {
    protected int temperature;
    protected int weight;

    private String color = "grey";

    public Mammal (int temp,int w){
        this.temperature = temp;
        this.weight = w;
    }

    public Mammal (){

    }



    public void makeSound (){
        System.out.println("я большой на " + weight);
    }

    public void printYourColor() {
        System.out.println("In Mammal color");
        System.out.println(this.color);
    }
}
