package OOP.travel;

import java.util.ArrayList;

public class Backpack {
    private int limitWeightBackpack;
    private int currentWeightBackpack = 0;
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public Backpack(int limitWeight) {
        if (limitWeight <= 0){
            throw new RuntimeException("Weight must be positive.");
        }
        this.limitWeightBackpack = limitWeight;
    }


    void addItem(Item newItem) {
        if ((currentWeightBackpack + newItem.weight) > limitWeightBackpack) {
            System.out.println("You couldn't put a " + newItem.getItemType() + " in your backpack. It's already full.");
            return;
        }
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItemType() == newItem.getItemType()) {
                System.out.println("You already put " + newItem.getItemType());
                return;
            }
        }
        itemList.add(newItem);
        currentWeightBackpack = currentWeightBackpack + newItem.weight;
        System.out.println("You add  " + newItem.getItemType());
    }

    void deleteItem(Item itemToDell) {
        boolean itemDell = false;
        for (int i = 0; i < itemList.size(); i++) {
            if (itemToDell.equals(itemList.get(i))) {
                itemList.remove(itemToDell);
                currentWeightBackpack = currentWeightBackpack - itemToDell.weight;
                itemDell = true;
                System.out.println("item " + itemToDell.getItemType() + " has been deleted");
            }
        }
        if (itemDell) {
            System.out.println("we did not find " + itemToDell.getItemType() + " in your backpck");
        }
    }

    public int getCurentWeight() {
        return currentWeightBackpack;
    }
}
