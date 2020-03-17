package java_lang.threadlocal;

public class ThreadLocalDemo {

  private static ThreadLocal<Integer> i = new ThreadLocal<>();

  private static void doSomething()
  {
    System.out.println(i.get());
  }

  private static void doSomethingElse()
  {
    System.out.println(i.get());
  }

  public static void main(String[] args)
  {
    new Thread(() -> {
      i.set(10);
      doSomething();
      doSomethingElse();
    }).start();
    new Thread(() -> {
      i.set(20);
      doSomething();
      doSomethingElse();
    }).start();
  }

}
