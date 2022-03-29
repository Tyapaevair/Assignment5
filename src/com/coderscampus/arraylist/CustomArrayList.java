package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int itemSize = 0;

	@Override
	public boolean add(T item) {

		if (itemSize == items.length) {
			items = increaseSize();
		}

		items[itemSize] = item;
		itemSize++;

		return true;
	}

	private Object[] increaseSize() {
		Object[] tempArray = new Object[itemSize * 2];
		for (int i = 0; i < itemSize; i++) {
			tempArray[i] = items[i];
		}
		return tempArray;
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
