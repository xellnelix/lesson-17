package ru.otus.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Tree implements SearchTree {
	int value;
	Tree left;
	Tree right;

	public void createNodes(List<Integer> list) {
		value = list.get((list.size() - 1) / 2);
		for (Integer element : list) {
			if (element == value) {
				continue;
			}
			if (element > value) {
				right = new Tree();
				right.value = element;
				right.createNodes(list.subList((list.size() - 1) / 2 + 1, list.size()));
			} else {
				left = new Tree();
				left.value = element;
				left.createNodes(list.subList(0, (list.size() - 1) / 2));
			}
		}
	}

	@Override
	public Integer find(int element) {
		if (element == this.value) {
			return this.value;
		}
		if (this.value > element && this.left != null) {
			return this.left.find(element);
		}
		if (this.value < element && this.right != null) {
			return this.right.find(element);
		}
		return null;
	}

	@Override
	public List<Tree> getSortedList() {
		List<Tree> tree = new ArrayList<>();
		tree.add(this);
		return tree;
	}

	@Override
	public String toString() {
		return "Node: " + this.value +
				"\n Left child of " + this.value + " is " + this.left +
				"\n Right child of " + this.value + " is " + this.right;
	}
}
