package com.bmcl.numbers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAggregator {

    public int max(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }

        int max = list.get(0);
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int sum(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public int min(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }

        int min = list.get(0);
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int distinct(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>(list);
        return uniqueNumbers.size();
    }
}
