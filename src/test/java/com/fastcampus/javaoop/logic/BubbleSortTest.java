package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @DisplayName("버블소트")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();


        //when
        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1));


        //then
        assertEquals(Arrays.asList(1,2,3,4,5), actual);
    }
}