package com.fastcampus.service;

import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;

import java.util.List;

public class SortService {

     private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
