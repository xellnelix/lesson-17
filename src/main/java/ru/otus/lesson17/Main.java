package ru.otus.lesson17;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> testList = List.of(1, 2, 3, 4, 5, 6, 7);
		List<Integer> testEmptyList = List.of();
		Tree t = new Tree();
		t.createNodes(testEmptyList);
//		t.createNodes(testList);
		System.out.println(t.find(4));
		System.out.println(t.find(15));
		System.out.println(t.getSortedList());
	}
}
