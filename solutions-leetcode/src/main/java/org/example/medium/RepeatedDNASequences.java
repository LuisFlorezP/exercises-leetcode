package org.example.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

    public static List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i + 10 > s.length()) break;
            String secuence = s.substring(i, i + 10);
            if (map.containsKey(secuence)) map.replace(secuence, map.get(secuence) + 1);
            else map.put(secuence, 0);
        }
        for ( Map.Entry<String, Integer> mapsito : map.entrySet() ) if (mapsito.getValue() > 0) list.add(mapsito.getKey());
        return list;
    }
}
