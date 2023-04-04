package com.fastcampus;

import com.fastcampus.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();
        // Pull Request로 issue 닫아보기
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
