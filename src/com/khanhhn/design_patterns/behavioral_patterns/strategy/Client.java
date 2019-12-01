package com.khanhhn.design_patterns.behavioral_patterns.strategy;

public class Client {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java Core");
        sortedList.add("Java Design Patter");
        sortedList.add("Java Library");
        sortedList.add("Java Framework");
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
