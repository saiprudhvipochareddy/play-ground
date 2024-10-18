package sort;

public class MergeSortedArray {

  public static Integer[] mergeTwoArraysAndSort(Integer[] input1, Integer[] input2) {
    Integer[] merge = {};
    if(input1.length == 0){
      return input2;
    }
    if(input2.length == 0){
      return input1;
    }
//    var array1Items = input1[0];
//    var array2Items = input2[0]; // solve it once after clearing about sorting techniques

//    while(array1Items  array2Items){
//
//    }




    return merge;
  }
  public static void main(String[] args) {
    Integer[] input1 = {0,3,4,31};
    Integer[] input2 = {4,6,30};
    Integer[] finalMerged = mergeTwoArraysAndSort(input1, input2);
    System.out.println(finalMerged);
  }
}
