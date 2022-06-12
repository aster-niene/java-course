package OOP.arrays;

public class CatOwnerDemo {
    public static void main(String[] args){
        CatOwner crazyCatLady = new CatOwner();
        crazyCatLady.makeCats(7);

        for (String name: crazyCatLady.tellCatNames()){
            System.out.println(name);
        }
    }
}
