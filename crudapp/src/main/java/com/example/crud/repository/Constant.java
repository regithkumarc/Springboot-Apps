package com.example.crud.repository;

public class Constant {
	public static String name = "";
	public static String price = "";
	public static String queryValue = doWithEntityManager(name,price);
	public static final String query = queryValue;
	
	public static final String queryData = "select * from product where name = "+ name +" and price = " + price;
	
	public static final String doWithEntityManager(String name,String price) {

        final StringBuilder builder = new StringBuilder();
        // SELECT
        builder.append("SELECT * from product");
        builder.append(" WHERE name =:" + name);
        builder.append(" and price =:" + price);
        
        String nativeQuery = builder.toString();
        //System.out.println(nativeQuery);
       // Query query = (Query) entityManager.createNativeQuery(nativeQuery, "Product");
        
        System.out.println("Query String : " + nativeQuery);
        
        return nativeQuery;
	}
}
