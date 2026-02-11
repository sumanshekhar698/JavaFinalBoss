package dev.codecounty.map;

import java.util.HashMap;

public class FreqMap {

    public static void main(String[] args) {
        String str = "TheworldisAstageAndAllthemenandwomenareplayers";

        String str2 = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//            }else{
//                map.put(ch,1);
//            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);

//            map.computeIfAbsent()

        }


        System.out.println(map);


    }
}
