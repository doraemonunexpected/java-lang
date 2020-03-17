package java_lang.proxy;

import java.lang.reflect.Proxy;

public class ProxyMain {

  public static void main(String[] args)
  {
    FooI o = (FooI) Proxy.newProxyInstance(
      ProxyMain.class.getClassLoader(),
      new Class[]{FooI.class},
      new FooProxy(new Foo()));
    o.doThis();
    o.doThat();
    System.out.println("o = " + o);
  }

}
