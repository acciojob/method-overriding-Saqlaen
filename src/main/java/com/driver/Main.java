package com.driver;
class A {
  public String meth(){
    return "Invoking method from class A";
  }
}
class B extends A {
 public String meth(){
   return "Method is overridden in Extendend class B";
 }
}
public class Main {
  B obj = new B();
  System.out.println( obj.meth() );
}
