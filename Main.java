package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() == 0 || b.size() == 0)
            a.addAll(b);
        else {
            int i = 0;
            int bSize = b.size();
            outer:
            for (int j = 0; j < bSize; j++) {
                int aSize = a.size();
                for (; i < aSize; i++) {
                    if (b.get(j) <= a.get(i) || i == a.size() - 1) {
                        if (b.get(j) >= a.get(i) & i == a.size() - 1) {
                            a.add(i + 1, b.get(j));
                            continue outer;
                        }
                        a.add(i, b.get(j));
                        continue outer;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList());
        merge(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}