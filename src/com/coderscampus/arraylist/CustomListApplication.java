package com.coderscampus.arraylist;

public class CustomListApplication {
	 public static void main(String[] args) {

		  CustomList<String> myCustomList = new CustomArrayList<>();
		  myCustomList.add("element 1"); // and continue to add another 10, 20 or 40 more elements
		  myCustomList.add("element 2");
		  myCustomList.add("element 3");
		  myCustomList.add("element 4");
		  myCustomList.add("element 5");
		  myCustomList.add("element 6");
		  myCustomList.add("element 7");
		  myCustomList.add("element 8");
		  myCustomList.add("element 9");
		  myCustomList.add("element 10");
		  myCustomList.add("element 11");
		  myCustomList.add("element 21");


		  // then you should validate that all the elements you've inserted actually exist in your data structure
		  for(int i = 0; i < myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
		  }

	 }
}