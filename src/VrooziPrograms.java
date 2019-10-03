import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class VrooziPrograms {
  public static String getSeasonsUsingSwitchStatement(String seasonOfYearArg)
  {
    String nameofSeason;
    switch (seasonOfYearArg)
    {
      case "March":
      case "April":
      case "May":
        nameofSeason = "Spring";
        break;
      case "June":
      case "July":
      case "Auguest":
        nameofSeason = "Summer";
        break;
      case "September":
      case "October":
      case "November":
        nameofSeason = "Autumn";
        break;
      case "December":
      case "January":
      case "February":
        nameofSeason = "Winter";
        break;
      default:
        throw new IllegalArgumentException("Invalid month for season of the year:" + seasonOfYearArg);
    }
    return nameofSeason;
  }

  public static void swipe()
  {
    int x = 5, y = 9;

    System.out.println("x = " + x);
    System.out.println("y = " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }

  public static void parenthesisBalancing()
  {
    Scanner scanner = new Scanner(System.in);

    String exp = scanner.nextLine();

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < exp.length() ; i++) {
      char c = exp.charAt(i);
      if(c == '(')
      {
        System.out.println("'(' pushed at index " + i);
        stack.push(i);
      }
      else if (c == ')')
      {
        System.out.println("')' poped at index " + stack.pop());

      }
    }

    while (!stack.isEmpty())
    {
      System.out.println("unmatched = " + stack.pop());
    }


  }

  public static void maxAndSecondMax(List<Integer> list)
  {
    int max =0, secondmax=0;

    for (int j = 0; j < list.size(); j++) {
      if(list.get(j) > max)
      {
        secondmax = max;
        max = list.get(j);
      }
      else if(list.get(j) > secondmax)
      {
        secondmax = list.get(j);
      }
    }

    System.out.println("max = " + max);
    System.out.println("secondmax = " + secondmax);

  }

  public static void removeOddItem(List<String> list) {

    for (int i = list.size()-1; i >= 0 ; i--) {
      if (list.get(i).equals("Odd")) {
        list.remove(i);
      }
    }

    for (String value:list
        ) {
      System.out.println("value = " + value);
    }
  }

  public static void deleteEven(List<Integer> list)
  {
    for (int i = list.size()-1; i >= 0; i--) {
      if (list.get(i)%2==0)
        list.remove(i);
    }

    for (int value:list
        ) {
      System.out.println("value = " + value);
    }
  }


  public static void countChar(String str)
  {

    Set<String> charset = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      charset.add(String.valueOf(str.charAt(i)));
    }

    for (String str1:charset
    ) {
      System.out.println("str1 = " + str1);
    }

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i <str.length() ; i++) {
      String c = String.valueOf(str.charAt(i));
      if(map.get(c) != null)
      {
        int count = map.get(c)+1;
        map.put(c,count);
      }
      else
      {
        map.put(c,1);
      }
    }

    /*for (String c:charset) {
      int v = (str.length() - str.replace(c,"").length());
      map.put(c, v) ;
    }*/

    for (String c:map.keySet()) {
      System.out.println(c + " : " + map.get(c));
    }
  }
}
