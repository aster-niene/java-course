package OOP.travel;



public class Backpack {

    private int limitWeightBackpack;
    private int curentWeightBackpck = 0;
    private int numberItems = 0;

    public Backpack (int limitWeight) {
        this.limitWeightBackpack = limitWeight;
    }

    Item itemList[] = new Item[0];

    public Item[] addItem (Item item){
        Item newItemList[] = new Item[itemList.length + 1];
        for(int i = 0; i <  itemList.length; i++){
            newItemList[i] = itemList[i];
        }
        newItemList[itemList.length + 1] = item;
        curentWeightBackpck = curentWeightBackpck + item.weight;
        if(curentWeightBackpck > limitWeightBackpack){
            System.out.println("maximum weight reached");
            return itemList;
        }
        for(int i = 0; i <newItemList.length; i++){
            if (newItemList[i].itemTypes == item.itemTypes){
                System.out.println("you already put this item");
                return itemList;
            }
        }
        return newItemList;
    }

    public Item[] dellItem (Item item){
        return itemList;
    }

    public int getCurentWeightBackpck(){
        return curentWeightBackpck;
    }

    public static void main (String[] args){
        Item arrItem[] = new Item[3];
        arrItem[0] = new Item("tent", 2, ItemTypes.TENT);
        arrItem[1] = new Item("sleeping bag", 2, ItemTypes.SLEEPING_BAG);
        arrItem[2] = new Item("mat", 2, ItemTypes.MAT);


        System.out.println(arrItem[1].itemName + arrItem[1].itemTypes);

        Backpack myBackpack = new Backpack(12);
        Item tent = new Item("tent", 2, ItemTypes.TENT);
        Item mat = new Item("mat", 2, ItemTypes.MAT);
        myBackpack.addItem(tent);
        myBackpack.addItem(mat);
        myBackpack.addItem(tent);


    }

}
