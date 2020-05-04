package com.yiyang.strategy.comparator;

public class Snake implements Comparable<Snake> {

    public int length;

    public Snake (int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "length=" + length +
                '}';
    }

    @Override
    public int compareTo(Snake s) {
        if (this.length < s.length) return -1;
        else if (this.length > s.length) return 1;
        else return 0;
    }
}
