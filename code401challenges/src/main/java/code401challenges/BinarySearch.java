package code401challenges;

import java.util.Arrays;

public class BinarySearch {

//    public static int binarySearch(int[] sortedArray, int key) {
//        int value = 0;
//        int index = 0;
//
//        while (value <= key) {
//            int mid = sortedArray.length / 2;
//            if (sortedArray[mid] < key) {
//                value = mid + 1;
//            } else if (sortedArray[mid] > key) {
//                value = mid - 1;
//            } else if (sortedArray[mid] == key) {
//                index = mid;
//                break;
//            }
//        }
//        return index;
//    }

    public static int binarySearch2(int[] sortedArray, int key){
        int index = Arrays.binarySearch(sortedArray,key);
        return index;
    }

}