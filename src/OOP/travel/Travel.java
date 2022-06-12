package OOP.travel;

public class Travel {

    public static void main(String[] args) {
        Backpack myBackpack = new Backpack(15);
        Item tent = new Item(3, ItemTypes.TENT);
        Item mat = new Item(3, ItemTypes.MAT);
        Item sweater = new Item(2, ItemTypes.SWEATER);
        Item food = new Item(4, ItemTypes.FOOD);
        Item sleepingBag = new Item(6, ItemTypes.SLEEPING_BAG);
        myBackpack.addItemInBackpack(tent);
        myBackpack.addItemInBackpack(mat);
        myBackpack.addItemInBackpack(tent);
        myBackpack.addItemInBackpack(food);
        myBackpack.addItemInBackpack(sweater);
        System.out.println(myBackpack.getCurentWeightBackpck());
        myBackpack.dellItem(sweater);
        myBackpack.dellItem(sweater);
        System.out.println(myBackpack.getCurentWeightBackpck());
        myBackpack.addItemInBackpack(sleepingBag);
        System.out.println(myBackpack.getCurentWeightBackpck());
        System.out.println(food);
    }


}
