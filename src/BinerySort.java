import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BinerySort {


  public static void main(String a[]) {

    Scanner in = new Scanner(System.in);
    int n = 0;
    n = Integer.parseInt(in.nextLine().trim());
    Integer[] elements = new Integer[n];
    int element;
    for (int i = 0; i < n; i++) {
      element = Integer.parseInt(in.nextLine().trim());
      elements[i] = element;
    }

    int[] results = rearrange(elements);

    for (Integer sortInt : results) {
      System.out.println(sortInt);
    }
  }

  private static int[] rearrange(Integer[] elements) {
    Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(elements));
    Integer[] sortedArray = sortedSet.toArray(new Integer[sortedSet.size()]);

    Map<Integer, Integer> countNumberOfOne = new HashMap<>();

    for (int i = 0; i < sortedArray.length; i++) {

      String binaryString = Integer.toBinaryString(sortedArray[i]);
      int noOfOnes = binaryString.length() - binaryString.replaceAll("1", "").length();
      countNumberOfOne.put(i, noOfOnes);
    }

    List<Integer> sortedList = new ArrayList<>();
    Set<Integer> uniqueSet = new HashSet<>(countNumberOfOne.values());

    for (int iterator = 0; iterator < uniqueSet.size(); iterator++) {
      int maxValue = Collections.min(countNumberOfOne.values());
      for (Map.Entry<Integer, Integer> entry : countNumberOfOne.entrySet()) {
        if (entry.getValue() == maxValue) {
          sortedList.add(sortedArray[entry.getKey()]);
        }
      }
      while (countNumberOfOne.containsValue(maxValue))
        countNumberOfOne.values().remove(maxValue);
    }

    int[] sortedArr = new int[sortedList.size()];

    for (int i = 0; i < sortedList.size(); i++) {
      sortedArr[i] = sortedList.get(i);
    }

    return sortedArr;
  }
}
