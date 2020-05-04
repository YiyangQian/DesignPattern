package com.yiyang.strategy.comparator;

import java.util.Arrays;

/**
 * with Comparable, we are able to sort different classes
 * but we still cannot sort cat in different ways
 * eg. we cannot offer to sort cats by weight, and sort by height
 */
public class Main {

    public static void main(String[] args) {

        Snake[] snakes = {new Snake(5), new Snake(5), new Snake(6), new Snake(1)};
        Sorter<Snake> snakeSorter = new Sorter<>();
        snakeSorter.sort(snakes, new SnakeComparator( ));
        System.out.println(Arrays.toString(snakes));

        Cat[] cats = {new Cat(5, 1), new Cat(5, 5), new Cat(6, 5), new Cat(1, 6)};
        Sorter<Cat> catSorter = new Sorter<>();
        catSorter.sort(cats, new CatWeightComparator());
        System.out.println(Arrays.toString(cats));
        catSorter.sort(cats, new CatHeightComparator());
        System.out.println(Arrays.toString(cats));

        catSorter.sort(cats, (cat1, cat2) -> {
            if (cat1.weight * cat1.height > cat2.weight * cat2.height) return -1;
            else if (cat1.weight * cat1.height < cat2.weight * cat2.height) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(cats));
    }
}
