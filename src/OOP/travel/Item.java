package OOP.travel;

public class Item {
    int weight;
    ItemTypes itemTypes;
    String itemName;
    public Item(String itemName, int weight, ItemTypes itemTypes){
        this.itemName = itemName;
        this.weight = weight;
        this.itemTypes = itemTypes;
    }
}
