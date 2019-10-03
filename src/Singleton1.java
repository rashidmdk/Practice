public class Singleton1 {

   /*This implementation has a problem if two threads simultaneously invokes getInstance method, two instance of
   Singleton1 will be created.*/

  private static Singleton1 singleton = new Singleton1();

  private Singleton1() {
  }

  public static Singleton1 getInstance() {
    return singleton;
  }
}
