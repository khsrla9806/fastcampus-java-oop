package com.fastcampus.javaoop;

import com.fastcampus.javaoop.Main;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        // Given
        String[] args = {"3", "1", "2"};

        // When & Then
        Main.main(args);
    }
}