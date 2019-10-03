public class Singleton4 {

  public static class Singleton{


    private Singleton(){}

    private static class SingletonHolder{
      private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
      return SingletonHolder.singleton;
    }
  }

  public static Singleton getOnlyOne()
  {
    return Singleton.getInstance();
  }

}
