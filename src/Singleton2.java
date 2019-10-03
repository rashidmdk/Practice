public class Singleton2 {

  /*This implementation has the same problem if two threads simultaneously invokes getInstance method, two instance of
  Singleton1 will be created.*/

  private static Singleton2 singleton = null;

  private Singleton2() {
  }

  public static Singleton2 getInstance() {
    if(singleton == null)
      return new Singleton2();
    else
      return singleton;
  }

}
