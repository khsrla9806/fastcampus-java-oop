package com.fastcampus.springapply.logic;

import com.fastcampus.javaoop.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void list_asc_sort_test() {
        // Given
        com.fastcampus.javaoop.logic.BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

}