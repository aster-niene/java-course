package OOP.nested;

import java.sql.SQLOutput;

public class Lighter {
    private String color;
    private boolean light = false;

    public void setColor(String color){
        this.color = color;
    }
    public void setLight(boolean light){
        this.light = light;
    }

    public boolean gerLight(){
        System.out.println("Am i on fire? It is " + light);
        return light;
    }

}
