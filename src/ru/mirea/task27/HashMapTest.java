package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> idAndNames = new HashMap<>();
        idAndNames.put(3546, "Александр");
        idAndNames.put(784561, "Пелагея");
        idAndNames.put(95612, "Виктор");
        System.out.println(idAndNames);

        idAndNames.put(345612, "Петр");
        System.out.println(idAndNames);

        String n1 = idAndNames.get(123456);
        System.out.println(n1);

        idAndNames.remove(234561);
        System.out.println(idAndNames);

        System.out.println(idAndNames.containsKey(111111));
        System.out.println(idAndNames.containsValue("Алкесандр"));

        Set<Integer> keys = idAndNames.keySet();
        System.out.println("Ключи: " + keys);
        ArrayList<String> values = new ArrayList<>(idAndNames.values());
        System.out.println("Значения: " + values);

        System.out.println(idAndNames.size());

        idAndNames.clear();
        System.out.println(idAndNames.isEmpty());

        HashMap<Integer, String> idAndNames1 = new HashMap<>();
        HashMap<Integer, String> idAndNames2 = new HashMap<>();

        idAndNames1.put(456, "Тапочка");
        idAndNames1.put(289, "Арений");
        idAndNames1.put(265612, "Валерий");

        idAndNames2.put(421, "Тома");
        idAndNames2.put(73216, "Галя");

        idAndNames1.putAll(idAndNames2);
        for(Map.Entry en:idAndNames1.entrySet()){
            System.out.println(en);
        }
    }
}
