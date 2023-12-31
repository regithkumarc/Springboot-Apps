package com.example.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDate {
	
	public static List<ProductInfo> getProductInfoList() throws ParseException {
		List<ProductInfo> list = Arrays.asList(
//				new ProductInfo(1, "t1", "17-10-2023",new SimpleDateFormat("dd-MM-yyyy").parse("17-10-2023")),
//				new ProductInfo(1, "t2", "12-09-2023",new SimpleDateFormat("dd-MM-yyyy").parse("12-09-2023")),
//				new ProductInfo(1, "t3", "11-11-2023",new SimpleDateFormat("dd-MM-yyyy").parse("11-11-2023")),
//				new ProductInfo(1, "t4", "10-08-2023",new SimpleDateFormat("dd-MM-yyyy").parse("10-08-2023")),
//				new ProductInfo(1, "t2", "12-06-2023",new SimpleDateFormat("dd-MM-yyyy").parse("12-06-2023")),
//				new ProductInfo(1, "t2", "12-08-2023",new SimpleDateFormat("dd-MM-yyyy").parse("12-08-2023")),
//				new ProductInfo(1, "t2", "12-12-2023",new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2023")),
//				new ProductInfo(1, "t2", "12-05-2023",new SimpleDateFormat("dd-MM-yyyy").parse("12-05-2023"))
				
//				new ProductInfo(1, "t1", "2023-Oct-17",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Oct-17")),
//				new ProductInfo(2, "t2", "2023-Sep-12",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Sep-12")),
//				new ProductInfo(3, "t3", "2023-Nov-11",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Nov-11")),
//				new ProductInfo(4, "t4", "22023-Aug-10",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Aug-10")),
//				new ProductInfo(5, "t2", "2023-Jun-12",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Jun-12")),
//				new ProductInfo(6, "t2", "2023-Aug-12",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Aug-12")),
//				new ProductInfo(7, "t2", "2023-Dec-12",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-Dec-12")),
//				new ProductInfo(8, "t2", "2023-May-12",new SimpleDateFormat("yyyy-MMM-dd").parse("2023-May-12"))
				
				new ProductInfo(1, "t1", "2023-Oct-17","2023-Oct-17"),
				new ProductInfo(2, "t2", "2023-Sep-12","2023-Sep-12"),
				new ProductInfo(3, "t3", "2023-Nov-11","2023-Nov-11"),
				new ProductInfo(4, "t4", "22023-Aug-10","2023-Aug-10"),
				new ProductInfo(5, "t2", "2023-Jun-12","2023-Jun-12"),
				new ProductInfo(6, "t2", "2023-Aug-12","2023-Aug-12"),
				new ProductInfo(7, "t2", "2023-Dec-12","2023-Dec-12"),
				new ProductInfo(8, "t2", "2023-May-12","2023-May-12")
				
				);
		return list;
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		List<ProductInfo> list = getProductInfoList();
		
		List<ProductInfo> sortedList = list.stream()
				.sorted(Comparator.comparing(ProductInfo::getCreatedOn))
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
			
	}

}
