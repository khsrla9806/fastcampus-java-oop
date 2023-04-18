package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        // Pull Request로 issue 닫아보기
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
        // 나는 테스트 브랜치 1
    }
}
