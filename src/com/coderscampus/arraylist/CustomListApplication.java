package com.coderscampus.arraylist;

public class CustomListApplication {
	 public static void main(String[] args) {

		  CustomList<Integer> myNumbers = new CustomArrayList<>();
		 
		  for(int i = 1; i<= 40; i++){
myNumbers.add(i);
		  }



		  // then you should validate that all the elements you've inserted actually exist in your data structure
		  for(int i = 0; i < myNumbers.getSize(); i++) {
				System.out.println(myNumbers.get(i));
		  }

	 }
}