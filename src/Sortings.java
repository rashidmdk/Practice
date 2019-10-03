import java.util.List;

public class Sortings {

  public static List<Integer> sortAscending(List<Integer> list)
  {
    for(int i=0;i<list.size();i++)
    {
      for(int j=i;j<list.size();j++)
      {
        if(list.get(i) > list.get(j))
        {
          Integer temp = list.get(i);
          list.set(i,list.get(j));
          list.set(j,temp);
        }
      }
    }
    Integer[] array = (Integer[])list.toArray();

    for(int i=0;i<array.length;i++)
    {
      for(int j=i;j<array.length;j++)
      {
        if(array[i] > array[j])
        {
          array[i] = array[i] + array[j];
          array[j] = array[i] - array[j];
          array[i] = array[i] - array[j];
        }

      }
    }
    for (Integer myint: array) {
      System.out.println("myint = " + myint);
    }
    return list;
  }

}
