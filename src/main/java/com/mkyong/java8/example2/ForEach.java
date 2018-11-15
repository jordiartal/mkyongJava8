package com.mkyong.java8.example2;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> items = forEachListItems();
		
		// lambda
		// Output : A,B,C,D,E
		System.out.println("--->>> With Lambda");
		items.forEach(item -> System.out.println(item));

		// Output : C
		System.out.println("--->>> With Lambda only output C");
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		System.out.println("--->>> With Lambda with method reference");
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		System.out.println("--->>> With Lambda Stream and Filter contains B");
		items.stream()
				.filter(s -> s.contains("B"))
				.forEach(System.out::println);

	}

	public static List<String> forEachListItems() {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		return items;
	}

}
