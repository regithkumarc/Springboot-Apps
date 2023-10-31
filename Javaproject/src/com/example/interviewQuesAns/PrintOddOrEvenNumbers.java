package com.example.interviewQuesAns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddOrEvenNumbers {

	public void printOddNumbers(List<Integer> list) {
		
		List<Integer> evenList = list.stream().filter(m -> m %2 == 0).collect(Collectors.toList());
		System.out.println("Even List : " + evenList);
		
		List<Integer> oddList = list.stream().filter(m -> m %2 != 0).collect(Collectors.toList());
		System.out.println("Odd List : " + oddList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddOrEvenNumbers pon = new PrintOddOrEvenNumbers();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5); 
		pon.printOddNumbers(list);
	}

}
