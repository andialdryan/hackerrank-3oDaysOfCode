package org.example.day8;

import java.util.HashMap;
import java.util.Map;

public class dictionaryPractice {
    public static void main(String[] args) {
        Map<String, String> engDictionary = new HashMap<String, String>();
        engDictionary.put("Senin", "Monday");
        engDictionary.put("Selasa", "Tuesday");
        engDictionary.put("Rabu", "Wednesday");
        engDictionary.put("Kamis", "Thursday");
        engDictionary.put("Jumat", "Friday");
        engDictionary.put("Sabtu", "Saturday");
        engDictionary.put("Minggu", "Sunday");

        System.out.println(engDictionary.get("Senin"));
        System.out.println(engDictionary.get("Selasa"));
        System.out.println(engDictionary.get("Rabu"));
        System.out.println(engDictionary.get("Kamis"));
        System.out.println(engDictionary.get("Jumat"));
        System.out.println(engDictionary.get("Sabtu"));
        System.out.println(engDictionary.get("Minggu"));
    }
}
