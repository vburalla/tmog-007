package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SolutionTest {

    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource(value =
            {"anagram,nagaram,true",
             "rat,car,false",
             "aacc,ccac,false"}, delimiter = ',')
    void testSolution(String s, String t, boolean result) {
        assertEquals(result, solution.isAnagram(s, t));
    }

}