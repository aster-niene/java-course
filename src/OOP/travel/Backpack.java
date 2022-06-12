package OOP.travel;

import java.util.ArrayList;

public class Backpack {
    private int limitWeightBackpack;
    private int curentWeightBackpck = 0;
    private int numberItems = 0;
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public Backpack(int limitWeight) {
        this.limitWeightBackpack = limitWeight;
    }


    void addItemInBackpack(Item newItem) {
        if ((curentWeightBackpck + newItem.weight) > limitWeightBackpack) {
            System.out.println("You couldn't put a " + newItem.itemTypes + " in your backpack. It's already full.");
            return;
        }
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i) == newItem) {
                System.out.println("You already put " + newItem.itemTypes);
                return;
            }
        }
        itemList.add(newItem);
        curentWeightBackpck = curentWeightBackpck + newItem.weight;
        System.out.println("You add  " + newItem.itemTypes);
    }

    void dellItem(Item itemToDell) {
        boolean itemDell = false;
        for (int i = 0; i < itemList.size(); i++) {
            if (itemToDell == itemList.get(i)) {
                itemList.remove(itemToDell);
                curentWeightBackpck = curentWeightBackpck - itemToDell.weight;
                itemDell = true;
                System.out.println("item " + itemToDell.itemTypes + " has been deleted");
            }
        }
        if (itemDell) {
            System.out.println("we did not find " + itemToDell.itemTypes + " in your backpck");
        }
    }
    public int getCurentWeightBackpck() {
        return curentWeightBackpck;
    }
}
