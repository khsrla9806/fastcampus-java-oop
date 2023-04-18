package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        // Pull Request로 issue 닫아보기
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
        // 훈섭 코드 추가
        // 훈섭 코드 추가 2
        // 테스트 코드 1
        // 테스트 코드 2
        // 테스트 코드 3
    }
}
