package ru.otus.lesson17;

import java.util.List;

public interface SearchTree {
	Integer find(int element);

	List<Tree> getSortedList();
}
