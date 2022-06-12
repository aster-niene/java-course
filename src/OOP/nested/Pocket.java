package OOP.nested;

public class Pocket {
    Lighter lighter;

    //контсруктор по умолчанию всегда есть, даже если он не задан явно
    public Pocket() {
    }

    public void setLighter(Lighter anyLighter){
        this.lighter = anyLighter;
        System.out.println("Pocket.setLighter: I've got a new lighter!");
    }

    public Lighter getLighter(){
        return lighter;
    }

}
