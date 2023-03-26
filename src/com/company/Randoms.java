package com.company;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected PrimitiveIterator.OfInt iter;

    public Randoms(int min, int max) {
        random = new Random();
        iter = random.ints(min, (max + 1)).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return iter.nextInt();
            }
        };
    }

}