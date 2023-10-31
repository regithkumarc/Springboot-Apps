package com.example.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCharactorCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "gainjavaknowledge efygyefuyefguegfuy wrh3eyrgyg efejiuhfui";

		Map<String, Long> output = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Output : " + output);

		HashMap<Character, Integer> countMapCount = new HashMap<>();

		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (countMapCount.containsKey(c)) {
				countMapCount.put(c, countMapCount.get(c) + 1);
			} else {
				countMapCount.put(c, 1);
			}
		}
		
		System.out.println(countMapCount);

		
		String[] input1 = {"gainjavaknowledge","hello java hai","welcome to chennai"};
		
		HashMap<String, Integer> countMapCount1 = new HashMap<>();
		
		Stream<String> stream = Arrays.stream(input1);

		Object[] charArray1 = stream.toArray();
		for (Object c : charArray1) {
			if (countMapCount.containsKey(c)) {
				countMapCount1.put((String) c, countMapCount1.get(c) + 1);
			} else {
				countMapCount1.put((String) c, 1);
			}
		}
		
		System.out.println(countMapCount1);

	}

}
