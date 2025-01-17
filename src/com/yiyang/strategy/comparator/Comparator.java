package com.yiyang.strategy.comparator;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}
