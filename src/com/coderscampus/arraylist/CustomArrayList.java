package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	 Object[] items = new Object[10];

	 @Override
	 public boolean add(T item) {
		  for(int i = 0; i < items.length; i++) {
				if(items[i] == null) {
					 items[i] = item;

					 return true;
				}

		  }
		  Object[] tempArray = new Object[items.length * 2];
		  System.arraycopy(items, 0, tempArray, 0, items.length);
		  items = tempArray;
		  for(int i = 0; i < items.length; i++) {
				if(items[i] == null) {
					 items[i] = item;

				}
		  }
		  return true;
	 }

	 @Override
	 public int getSize() {

		  return items.length;
	 }

	 @Override
	 public T get(int index) {

		  return (T) items[index];
	 }
}



