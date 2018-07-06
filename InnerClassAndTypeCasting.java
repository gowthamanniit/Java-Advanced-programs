package com.niit;

public class InnerClassAndTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Regular inner class
		 * Java inner class or nested class 
		 * syntax
		 * class Java_Outer_class{  
 		//code  
 		class Java_Inner_class{  
  		//code  
 		}  
		}  
		
		Advantage of java inner classes
There are basically three advantages of inner classes in java. They are as follows:

1) Nested classes represent a special type of relationship 
that is it can access all the members (data members and methods)
 of outer class including private.

2) Nested classes are used to develop more readable and maintainable code
 because it logically group classes and interfaces in one place only.

3) Code Optimization: It requires less code to write.
		
		 *
		 *Difference between nested class and inner class in Java
Inner class is a part of nested class. 
Non-static nested classes are known as inner classes.

Types of Nested classes
There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.

1)Non-static nested class (inner class)
		Member inner class
		Anonymous inner class
		Local inner class
2)Static nested class

---------------------
Type	               Description
Member Inner Class	   A class created within class and outside method.
Anonymous Inner Class  A class created for implementing interface or extending class. Its name is decided by the java compiler.
Local Inner Class	   A class created within method.
Static Nested Class	   A static class created within class.
Nested Interface	   An interface created within class or interface.


====================== 1. regular inner class =============================
class Outer_Demo {
   int num;
   
   // inner class
   private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class My_class {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}
=============================
		 
		 Regula inner class program 
		 class TestMemberOuter1{  
 private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  TestMemberOuter1 obj=new TestMemberOuter1();  
  TestMemberOuter1.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  
===================================2 method-local inner class================
public class Outerclass {
   // instance method of the outer class 
   void my_Method() {
      int num = 23;

      // method-local inner class
      class MethodInner_Demo {
         public void print() {
            System.out.println("This is method inner class "+num);	   
         }   
      } // end of inner class
	   
      // Accessing the inner class
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   
   public static void main(String args[]) {
      Outerclass outer = new Outerclass();
      outer.my_Method();	   	   
   }
}
============================3. anonymus inner class=============================
abstract class Person{  
  abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p=new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  
---
interface Eatable{  
 void eat();  
}  
class TestAnnonymousInner1{  
 public static void main(String args[]){  
 Eatable e=new Eatable(){  
  public void eat(){System.out.println("nice fruits");}  
 };  
 e.eat();  
 }  
}  
===============================4.static nested class======================
// static variable only access to (static inner class)

class TestOuter1{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  TestOuter1.Inner obj=new TestOuter1.Inner();  
  obj.msg();  
  }  
}  

class TestOuter2{  
  static int data=30;  
  static class Inner{  
   static void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  TestOuter2.Inner.msg();//no need to create the instance of static nested class  
  }  
}  
==============advancd==============
interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class TestNestedInterface1 implements Showable.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  Showable.Message message=new TestNestedInterface1();//upcasting here  
  message.msg();  
 }  
}  
========
class A{  
  interface Message{  
   void msg();  
  }  
}  
  
class TestNestedInterface2 implements A.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  A.Message message=new TestNestedInterface2();//upcasting here  
  message.msg();  
 }  
}  



		 */
		

		
		
		
	}

}
