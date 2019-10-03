public class ArrayDeclaration {

  public static void main(String args[])
  {
    int[] num = new int[2];
    int num1[] = new int[5];
    int num2[] = {3};
    int num4[];

    num4 = new int[4];
    System.out.println("num.length = " + num4.length);

    String a = new String("A");
    String b = new String("A");

    String s1 = "a";
    String s2 = "a";

    if(a == b)
    {
      System.out.println("1");
    }

    if (a.intern() == b.intern()) {
      System.out.println(2);
    }

    if (s1 == s2) {
      System.out.println(3);
    }



  }
}
