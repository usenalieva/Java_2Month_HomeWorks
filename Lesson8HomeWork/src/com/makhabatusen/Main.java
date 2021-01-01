package com.makhabatusen;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        HashMap<String, String[]> bigDictionary = new HashMap<>();

        dictionary.put("person", new String[]{"identity", "human", "individual", "creature"});
        dictionary.put("beautiful", new String[]{"pretty", "nice", "attractive", "charming"});
        dictionary.put("smart", new String[]{"clever", "intelligent", "wise", "proficient"});
        dictionary.put("country", new String[]{"nation", "land", "state", "homeland"});
        dictionary.put("big", new String[]{"huge", "major", "great", "massive"});
        dictionary.put("developed", new String[]{"modified", "renovated", "qualified", "reconditioned"});

        System.out.println("INITIAL DICTIONARY: ");
        for (Map.Entry<String, String[]> item : dictionary.entrySet())
            System.out.println(item.getKey() + " " + Arrays.toString(item.getValue()));
        System.out.println("__________");

        for (String key : dictionary.keySet()) {
            String[] values = dictionary.get(key);
            bigDictionary.put(key, values);
            for (String newKey : values) {
                ArrayList<String> editedValues = new ArrayList<>(values.length);
                editedValues.addAll(Arrays.asList(values));
                editedValues.remove(newKey);
                editedValues.add(key);
                String[] newValues = new String[editedValues.size()];
                newValues = editedValues.toArray(newValues);
                bigDictionary.put(newKey, newValues);
            }
        }
        System.out.println("BIG DICTIONARY: ");
        for (Map.Entry<String, String[]> item : bigDictionary.entrySet())
            System.out.println(item.getKey() + " " + Arrays.toString(item.getValue()));
        System.out.println("__________");

        while (true) {
            System.out.println("\nPlease, type a word/phrase from the dictionary: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            String[] words = word.split(" ");
            for (String a : words) {
                if (bigDictionary.get(a) != null) {
                    String[] synonyms = bigDictionary.get(a);
                    Random r = new Random();
                    int x = r.nextInt(synonyms.length);
                    System.out.print(synonyms[x] + " ");
                } else
                    System.out.println("\nThere's no such word in the dictionary: " + a);
            }
        }
    }
}
