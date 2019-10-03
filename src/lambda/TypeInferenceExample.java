package lambda;

public class TypeInferenceExample {

  public static void main(String args[])
  {
    StringLengthLambda stringLengthLambda = (s -> s.length());
    System.out.println(stringLengthLambda.getLength("This is my first Lambda Example"));
  }

  interface StringLengthLambda{
    int getLength(String s);
  }
}
