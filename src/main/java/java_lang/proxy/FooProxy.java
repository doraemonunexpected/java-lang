package java_lang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FooProxy implements InvocationHandler {

  private FooI foo;

  public FooProxy(FooI foo)
  {
    this.foo = foo;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    return method.invoke(foo, args);
  }

}
