package com.fastcampus.springapply;

import com.fastcampus.springapply.service.SortService;
import com.fastcampus.springapply.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 어노테이션 기반의 컨텍스트를 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}
