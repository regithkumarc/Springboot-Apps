package com.example.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map<String, Integer> map = new HashMap();
        map.put("z", 10);
        map.put("b", 5);
        map.put("a", 6);
        map.put("c", 20);
        map.put("d", 1);
        map.put("e", 7);
        map.put("y", 8);
        map.put("n", 99);
        map.put("g", 50);
        map.put("m", 2);
        map.put("f", 9);
        
        System.out.println(map);
        
        Map<String, Integer> sortedKeyMap =  map.entrySet().stream().sorted(Map.Entry.comparingByKey())
        	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue) -> oldValue,LinkedHashMap::new));
        
        System.out.println("Sort By Key : " + sortedKeyMap);
        
        Map<String, Integer> sortedValueMap =  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
            	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue) -> oldValue,LinkedHashMap::new));
            
        System.out.println("Sort By Value : " + sortedValueMap);
        
        
        Map<String,Integer> sortedValueMap1 = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> sortedValueMap1.put(x.getKey(), x.getValue()));;
        System.out.println("Sort By Value1 : " + sortedValueMap1);

	}

}
