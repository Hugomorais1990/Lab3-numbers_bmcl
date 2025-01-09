package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
public class ListDeduplicatorTest {
    private List<Integer> list;
    private List<Integer> expected;
    @BeforeEach
    public void setUp() {
        list = Arrays.asList(1,2,4,2,5);
        expected = Arrays.asList(1,2,4,5);
    }
    @Test
    public void deduplicate() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);
        Assertions.assertEquals(expected, distinct);
    }
    @Test
    public void deduplicateEmptyList() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> emptyList = Arrays.asList();
        List<Integer> distinct = deduplicator.deduplicate(emptyList);
        Assertions.assertEquals(emptyList, distinct);
    }

    @Test
    public void deduplicateWithAllDuplicates() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> duplicateList = Arrays.asList(2, 2, 2, 2, 2);
        List<Integer> expected = Arrays.asList(2);
        List<Integer> distinct = deduplicator.deduplicate(duplicateList);
        Assertions.assertEquals(expected, distinct);
    }

}