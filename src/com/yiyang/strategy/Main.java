package com.yiyang.strategy;

import java.util.Arrays;

/**
 * with Comparable, we are able to sort different classes
 * but we still cannot sort cat in different ways
 * eg. we cannot offer to sort cats by weight, and sort by height
 */
public class Main {

    public static void main(String[] args) {
        Cat[] cats = {new Cat(5, 1), new Cat(5, 5), new Cat(6, 5), new Cat(1, 6)};
        Sorter.sort(cats);
        System.out.println(Arrays.toString(cats));

        Snake[] snakes = {new Snake(5), new Snake(5), new Snake(6), new Snake(1)};
        Sorter.sort(snakes);
        System.out.println(Arrays.toString(snakes));
    }
}
