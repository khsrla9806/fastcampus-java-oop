package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private com.fastcampus.javaoop.service.SortService sort = new com.fastcampus.javaoop.service.SortService(new JavaSort<>());
    @Test
    void doSort() {
        // Given

        // When
        List<String> actual = sort.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}