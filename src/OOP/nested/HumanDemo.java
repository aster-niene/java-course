package OOP.nested;

public class HumanDemo {
    public static void main(String[] args) {
        Human human = new Human();

        Lighter redLighter = new Lighter();
        redLighter.setColor("red");
        //redLighter.setLight(true);
        Pocket pocket = new Pocket();
        pocket.setLighter(redLighter);

        human.setPocket(pocket);

        human.getPocket().getLighter().gerLight();
        human.getPocket().getLighter().setLight(true);

        human.getPocket().getLighter().gerLight();
       // human.getPocket();


        //System.out.println("My pocket is: " + human.getPocket());
    }
}
