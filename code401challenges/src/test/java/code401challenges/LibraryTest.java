/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code401challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testBinarySearch(){

        int[] testArray = new int[] {4,8,15,16,23,42};
        int testKey = 15;
        int expectedResult = 2;

        assertEquals(expectedResult, BinarySearch.binarySearch(testArray, testKey));
    }


    @Test
    public void testBinarySearch2(){

        int[] testArray = new int[] {4,8,15,16,23,42};
        int testKey = 42;
        int expectedResult = 5;

        assertEquals(expectedResult, BinarySearch.binarySearch(testArray, testKey));

    }

    @Test
    public void testBinarySearch3(){

        int[] testArray = new int[] {4,8,15,16,23,42};
        int testKey = 100;
        int expectedResult = -1;

        assertEquals(expectedResult, BinarySearch.binarySearch(testArray, testKey));

    }



}

