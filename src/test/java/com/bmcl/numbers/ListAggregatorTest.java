package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        list = Arrays.asList(1, 2, 4, 2, 5);
    }

    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);
        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);
        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);
        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);
        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void sumWithEmptyList() {
        ListAggregator aggregator = new ListAggregator();
        List<Integer> emptyList = Arrays.asList();
        int sum = aggregator.sum(emptyList);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void maxWithNegativeNumbers() {
        ListAggregator aggregator = new ListAggregator();
        List<Integer> negativeList = Arrays.asList(-1, -4, -5, -3);
        int max = aggregator.max(negativeList);
        Assertions.assertEquals(-1, max);
    }

    @Test
    public void distinctWithDuplicates() {
        ListAggregator aggregator = new ListAggregator();
        List<Integer> duplicateList = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        int distinct = aggregator.distinct(duplicateList);
        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void maxWithNegativeNumbersBug7263() {
        ListAggregator aggregator = new ListAggregator();
        List<Integer> negativeList = Arrays.asList(-1, -4, -5, -3);
        int max = aggregator.max(negativeList);
        Assertions.assertEquals(-1, max);
    }

    @Test
    public void distinctWithDuplicatesBug8726() {
        ListAggregator aggregator = new ListAggregator();
        List<Integer> duplicateList = Arrays.asList(1, 2, 4, 2, 5);
        int distinct = aggregator.distinct(duplicateList);
        Assertions.assertEquals(4, distinct);
    }
}
