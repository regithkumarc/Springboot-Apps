package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "sony", 1500));
		list.add(new Product(2, "samsung", 2000));
		list.add(new Product(3, "lenova", 3000));
		list.add(new Product(4, "hpp", 4000));
		
		Stream<Product> p1 =  list.stream();
		System.out.println(p1);
		
		boolean anyMatch = list.stream().anyMatch(m -> m.getName().equals("sony"));
		System.out.println(anyMatch);
		
		boolean allMatch = list.stream().allMatch(m -> m.getName().length() > 2);
		System.out.println(allMatch);
		
		boolean allMatch1 = list.stream().allMatch(m -> m.getPrice() > 1000);
		System.out.println(allMatch1);
		
		List<String> namesList = list.stream().map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(namesList);
		
		Float totalPrice = list.stream().map(m -> m.getPrice()).reduce(0.0f, (sum,price) -> sum + price);
		System.out.println(totalPrice);
		
		double totPrice = list.stream().collect(Collectors.summingDouble(m -> m.getPrice()));
		System.out.println(totPrice);
		
		Optional<Product> max =  list.stream().max((m1,m2) -> m1.getPrice() > m2.getPrice() ? 1 : -1);
		System.out.println(max);
		
		Optional<Product> min = list.stream().min((m1,m2) -> m1.getPrice() > m2.getPrice() ? 1: -1);
		System.out.println(min);
		
		long count = list.stream().map(m -> m.getPrice()).count();
		System.out.println(count);
		
		Integer intArray[] = {1,2,3,1,2,4,5};
		List<Integer> array =  Arrays.asList(intArray);
		
		Integer min1 = array.stream().min((m1,m2) -> m1 > m2 ? 1: -1).get();
		System.out.println("Min 1 : " + min1);
		
		Integer max1 = array.stream().max((m1,m2) -> m1 > m2 ? 1: -1).get();
		System.out.println("Max 1 : " + max1);
		
		Integer secondlargestNumber = array.stream().sorted().skip(intArray.length - 2).findFirst().get();
		System.out.println("secondlargestNumber : " + secondlargestNumber);
		
		List<Integer> list1 = Arrays.asList(1,2,3,1,2,4,5);
		Integer secondlargestNumber1 = list1.stream().sorted().skip(list1.size() - 2).findFirst().get();
		System.out.println("secondlargestNumber1 : " + secondlargestNumber1);
		
		Integer thirdlargestNumber = array.stream().sorted().skip(intArray.length - 3).findFirst().get();
		System.out.println(thirdlargestNumber);
		
		Integer secondSmallestValue = array.stream().sorted().skip(1).findFirst().get();
		System.out.println(secondSmallestValue);
		
		List<Integer> naturalOrder = array.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(naturalOrder);
		
		List<Integer> reverseOrder = array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);
		
		Integer intArray1[] = {1,2,3,1,2,4,5};
		List<Integer> intList = Arrays.asList(intArray1);
		
		Map<Object, Long> getCount = intList.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		//System.out.println(getCount.toString());
		System.out.println(getCount);
		
		List<Integer> withoutDuplicate =  array.stream().distinct().collect(Collectors.toList());
		System.out.println(withoutDuplicate);
		
		//Integer intArray1[] = {1,2,3,1,2,4,5};
		//List<Integer> intList = Arrays.asList(intArray1);
		
		//Map<Object, Long> getCount = intList.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		//System.out.println(getCount.toString());
		//System.out.println();)
	}

}
