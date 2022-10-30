import java.util.*;

public class ListToMapDemo {

    public static void main (String[] args) { // дано - list string, со днями недели. вернуть мапу, где ключ - день недели, а значение - количество раз, повторения этого дня.

        ArrayList<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Wednesday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Sunday");

        System.out.println(listInToHashMap(list));

    }

    private static LinkedHashMap listInToHashMap(ArrayList<String> list){

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Monday", 0);
        hashMap.put("Tuesday", 0);
        hashMap.put("Wednesday", 0);
        hashMap.put("Thursday", 0);
        hashMap.put("Friday", 0);
        hashMap.put("Saturday", 0);
        hashMap.put("Sunday", 0);

        for (String day : list) {
            if (hashMap.containsKey(day)) {
                int countDay = hashMap.get(day);
                countDay++;
                hashMap.put(day, countDay);
            }
        }
        return hashMap;

    }

}
