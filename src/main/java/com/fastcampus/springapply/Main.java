package com.fastcampus.springapply;

import com.fastcampus.springapply.logic.JavaSort;
import com.fastcampus.springapply.logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 어노테이션 기반의 컨텍스트를 생성
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        Sort<String> sort = new JavaSort<>();
        // Pull Request로 issue 닫아보기
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
