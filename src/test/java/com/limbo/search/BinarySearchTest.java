package com.limbo.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author limbo
 **/
class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("testBinarySearchArguments")
    public void testBinarySearch(int key, int[] array, int target){
        assertEquals(BinarySearch.rank(key, array), target);
    }


    private static Stream<Arguments> testBinarySearchArguments() {
        return Stream.of(
                Arguments.of(2, new int[]{1,2,3,4,5,6}, 1),
                Arguments.of(4, new int[]{1,2,3,4,5,6}, 3),
                Arguments.of(5, new int[]{1,2,3,4,5,6}, 4),
                Arguments.of(6, new int[]{1,2,3,4,5,6}, 5)
        );
    }
}