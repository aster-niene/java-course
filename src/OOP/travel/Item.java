package OOP.travel;

public class Item {
    int weight;
    private ItemTypes itemTypes;

    public Item(int weight, ItemTypes itemTypes) {
        if (weight <= 0){
            throw new RuntimeException("Weight of item must be positive.");
        }
        this.weight = weight;
        this.itemTypes = itemTypes;
    }

    public ItemTypes getItemType(){
        return this.itemTypes;
    }
}
