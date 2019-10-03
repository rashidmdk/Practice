package lambda;

public class Greeter {
  public void greet(Greeting greeting)
  {
    greeting.perform();
  }

  public static void main(String args[])
  {
    Greeter greeter = new Greeter();

    Greeting helloWorldGreeting = new HelloWorldGreeting();
    greeter.greet(helloWorldGreeting);

    Greeting myLambda = () -> System.out.println("Hello World!!!");
    greeter.greet(myLambda);

    Greeting anonymousClassImplentation = new Greeting() {
      @Override
      public void perform() {
        System.out.println("Hello World!!!");
      }
    };
    anonymousClassImplentation.perform();
  }
}

