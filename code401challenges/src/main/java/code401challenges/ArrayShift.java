package code401challenges;

import java.util.Arrays;

public class ArrayShift {
public static void main(String[] args){

    int[] testArrayEvenLength = new int[] {1,2,3,4,10,11};
    int[] testArrayOddLength = new int[] {1,2,3,4,10,11,12};
    int testValue1 = 99;
    int testValue2 = 77;

    shiftArray(testArrayEvenLength, testValue1);
    shiftArray(testArrayOddLength, testValue2);
    System.out.println("testArrayEvenLength: " + Arrays.toString(testArrayEvenLength) + " testValue: " + testValue1);
    System.out.println("testArrayOddLength: " + Arrays.toString(testArrayOddLength) + " testValue: " + testValue2);
}
    public static int[] shiftArray(int[] array, int value) {
        int[] newArray = new int[array.length +1];
        for (int i=0; i < newArray.length; i++) {
            if ( i < (array.length/2) ) {
                newArray[i] = array[i];
            } else if (i == (int) Math.ceil(array.length/2) && array.length %2 == 0) {
                newArray[i] = value;
            } else if (i == (int) Math.ceil(array.length/2) && array.length %2 != 0) {
                newArray[i] = array[i];
                newArray[i+1] = value;
            } else if (i > array.length/2 && array.length %2 == 0) {
                newArray[i] = array[i-1];
            } else if (i > (array.length/2 + 1) && array.length %2 != 0) {
                newArray[i] = array[i-1];
            }
        }
        System.out.println("newArray: " + Arrays.toString(newArray) );
        return newArray;
    }
}


//public class ArrayShift {
//    public static void main(String[] args) {
//
//        int[] startArr = new int[]{1, 2, 3, 4, 5, 10};
//
//        System.out.println(startArr);
//
//        int[] resultArr = shiftArray(int[] startArr, int 3, int 20);
//
//        System.out.println(resultArr);
//    }
//
//    public static int[] shiftArray(int[] a, int pos, int num) {
//        int[] result = new int[a.length];
//        for (int i = 0; i < pos; i++)
//            result[i] = a[i];
//        result[pos] = num;
//        for (int i = pos + 1; i < a.length; i++)
//            result[i] = a[i - 1];
//        return result;
//    }
//}
