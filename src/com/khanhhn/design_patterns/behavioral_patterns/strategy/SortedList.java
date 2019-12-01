package com.khanhhn.design_patterns.behavioral_patterns.strategy;

import java.util.ArrayList;
import java.util.List;

class SortedList {
    private SortStrategy sortStrategy;
    private List<String> items = new ArrayList<>();

    void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    void add(String name) {
        items.add(name);
    }

    void sort() {
        sortStrategy.sort(items);
    }
}
