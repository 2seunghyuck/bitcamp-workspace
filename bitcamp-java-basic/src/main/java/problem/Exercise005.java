package problem;

// 6-20번 다시
public class Exercise005 {
  static int max(int[] arr) {
    if (arr == null || arr.length == 0)
      return -999999;
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  public static void main(String[] args) {
    int[] data = {3, 2, 9, 4, 7, 11, 17, 4, 6, 8};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("최대값:" + max(data));
    System.out.println("최대값:" + max(null));
    System.out.println("최대값:" + max(new int[] {}));
  }
}

