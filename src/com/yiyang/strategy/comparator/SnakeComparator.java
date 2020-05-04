package com.yiyang.strategy.comparator;

public class SnakeComparator implements Comparator<Snake> {

    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.length < o2.length) return -1;
        else if (o1.length > o2.length) return 1;
        else return 0;
    }
}
