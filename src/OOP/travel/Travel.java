package OOP.travel;

public class Travel {

    public static void main(String[] args) {
        try {
            Backpack a = new Backpack(0);
        } catch (Exception e) {
            System.out.println("catched exeption " + e);
        }

        Backpack myBackpack = new Backpack(15);
        Item tent = new Item(3, ItemTypes.TENT);
        Item anotherTent = new Item(4, ItemTypes.TENT);
        Item mat = new Item(3, ItemTypes.MAT);
        Item sweater = new Item(2, ItemTypes.SWEATER);
        Item food = new Item(4, ItemTypes.FOOD);
        Item sleepingBag = new Item(6, ItemTypes.SLEEPING_BAG);
        myBackpack.addItem(tent);
        myBackpack.addItem(mat);
        myBackpack.addItem(anotherTent);
        myBackpack.addItem(food);
        myBackpack.addItem(sweater);
        System.out.println("current weight backpack " + myBackpack.getCurentWeight());
        myBackpack.deleteItem(sweater);
        myBackpack.deleteItem(sweater);
        System.out.println("current weight backpack " + myBackpack.getCurentWeight());
        myBackpack.addItem(sleepingBag);
        System.out.println("current weight backpack " + myBackpack.getCurentWeight());
    }
}
