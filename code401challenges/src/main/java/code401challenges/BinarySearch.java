package code401challenges;

import java.util.Arrays;
//resource: https://www.baeldung.com/java-binary-searchhttps://www.baeldung.com/java-binary-search

public class BinarySearch {

    public static int binarySearch(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length;

        while (left <= right) {

            int center = (left+right)/2;

            if (sortedArray[center] > key ) {
                right = center;
            }
            else if(sortedArray[center] < key){
                left = center;
            }

            else {
                return center;
            }

        }
        return -1;
    }



}