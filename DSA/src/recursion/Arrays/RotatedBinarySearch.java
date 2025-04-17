package recursion.Arrays;

public class RotatedBinarySearch {

  public static void main(String[] args) { // check it clearly with fresh mind
    int a[] = {5, 6, 7, 8, 9, 1, 2, 3};
    int b[] = {5, 6, 1, 2, 3, 4};
    System.out.println(search(a, 9, 0, a.length - 1));
    System.out.println(search(b, 2, 0, a.length-1));
  }

  static Integer search(int arr[], int target, int start, int end) {
    if (start > end) {
      return -1;
    }
    Integer mid = start + (end - start) / 2;
    if (arr[mid] == target) {
      return mid;
    }
    if (arr[start] <= arr[mid]) {
      if (target >= arr[start] && target <= arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    } else {
      if (target <= arr[end] && target >= arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return search(arr, target, start, end);
  }

}
