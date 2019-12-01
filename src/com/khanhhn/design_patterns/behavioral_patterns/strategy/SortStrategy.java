package com.khanhhn.design_patterns.behavioral_patterns.strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
