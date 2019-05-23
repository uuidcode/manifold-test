package manifoldtest.extensions.java.lang.String;

import manifold.ext.api.Extension;
import manifold.ext.api.This;
import java.lang.String;

@Extension
public class MyStringExt {
  public static void helloWorld(@This String thiz) {
    System.out.println("hello world!");
  }

  public static String twice(@This String thiz) {
    return thiz + thiz;
  }
}