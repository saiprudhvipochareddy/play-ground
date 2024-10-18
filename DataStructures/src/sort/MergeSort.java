package sort;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {8, 3, 4};
    System.out.println(Arrays.toString(mergeSort(arr)));

    int[] arr2 = {5, 10, 2, 6};
    mergeSortInline(arr2, 0, arr2.length-1);
    System.out.println(Arrays.toString(arr2));

//    int[] left = {5, 6, 7};
//    int[] right = {1, 2, 3};
//    System.out.println(Arrays.toString(merge(left, right)));

  }

  static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
  }

  static void mergeSortInline(int[] arr, int start, int end) {
    if (end - start == 1) {
      return;
    }
    int mid = start + end / 2;

    mergeSortInline(arr, start, mid);
    mergeSortInline(arr, mid, end);

    mergeInPlace(arr, start, mid, end);
  }

  private static void mergeInPlace(int[] arr, int start, int mid, int end) {
    int[] mixArr = new int[end - start];
    int i = start;
    int j = mid;
    int k = 0;

    while (i < mid && j < end) {
      if (arr[i] < arr[j]) {
        mixArr[k] = arr[i];
        i++;
      } else if (arr[i] > arr[j]) {
        mixArr[k] = arr[j];
        j++;
      }
      k++;
    }

    while (i < mid) {
      mixArr[k] = arr[i];
      i++;
      k++;
    }

    while (j < end) {
      mixArr[k] = arr[j];
      j++;
      k++;
    }
//    System.arraycopy(mixArr, 0, arr, start, mixArr.length);
    for(int l = 0; l< mixArr.length; l++){
      arr[start + l] = mixArr[l];
    }
  }

  //loop
  static int[] mergeSortLoop(int[] arr) { //TODO
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
  }


  private static int[] merge(int[] left, int[] right) {
    int[] merge = new int[left.length + right.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        merge[k] = left[i];
        i++;
      } else if (left[i] > right[j]) {
        merge[k] = right[j];
        j++;
      }
      k++;
    }
    //it may be possible that one of the arrays is not complete
    while (i < left.length) {
      merge[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      merge[k] = right[j];
      j++;
      k++;
    }

    return merge;
  }

}
