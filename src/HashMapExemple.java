import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExemple {


    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>(); // Создание мапы (словаря)
        passportsAndNames.put(212133, "Lidia Arkadievna Bublikova");
        passportsAndNames.put(162348, "Ivan Mihailovich Serebrikov");
        passportsAndNames.put(162348, "Petr Olegovich Sidorov");
        passportsAndNames.put(8082771, "Donald Jon Tramp");
        System.out.println("");
        System.out.println(passportsAndNames);


        String lidiaName = passportsAndNames.get(212133); // Получить значение из мапы (словаря)
        System.out.println(lidiaName);


        passportsAndNames.remove(162348);  // удалить значение из мапы (словаря)
        System.out.println(passportsAndNames);


        System.out.println(passportsAndNames.containsKey(11111)); // проверка по ключу
        System.out.println(passportsAndNames.containsValue("Donald Jon Tramp")); // проверка по значению



        Set<Integer> keys = passportsAndNames.keySet(); // Получить список ключей
        System.out.println("Keys: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values()); // Получить список значений
        System.out.println("Values: " + values);

        System.out.println(passportsAndNames.size()); // Вывести размер мапы (словаря)

        if (!passportsAndNames.isEmpty()) { // Проверка на не пустотность мапы (словаря)

            System.out.println(passportsAndNames);

        }


        HashMap<Integer, String> passportsAndNames2 = new HashMap<>(); // Создаем и наполняем еще одну мапу (словарь)
        passportsAndNames2.put(917352, "Alecsei");
        passportsAndNames2.put(925648, "Vfksim");


        passportsAndNames.putAll(passportsAndNames2); // соединяем 2 мапы (словаря)
        System.out.println(passportsAndNames);


        for (Map.Entry entry: passportsAndNames.entrySet()) { // Перебор всех связок ключ/значение внутри мапы (словаря)
            System.out.println(entry);
        }

        passportsAndNames.clear(); // Очистить мапу (словарь)
        System.out.println(passportsAndNames);


        // https://habr.com/ru/post/128017/ - ссыль на страницу с описанием мапы



    }




}
