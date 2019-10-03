public class Singleton3 {

  /*This implementation will solve the problem if two threads simultaneously invokes getInstant method, but only one
      of them will acquire the lock and only one method will be created.*/

  private static Singleton3 singleton = null;

  private Singleton3() {
  }

  public synchronized static Singleton3 getInstance() {
    if(singleton == null)
      return new Singleton3();
    else
      return singleton;
  }

}
