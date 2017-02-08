//Difference No.1:
//Abstract class can extend only one class or one abstract class at a time

class Example1{
	   public void display1(){
	      System.out.println("display1 method");
	   }
	}
	abstract class Example2{
	   public void display2(){
	      System.out.println("display2 method");
	   }
	}
	abstract class Example3 extends Example1{
	   abstract void display3();
	}
	class Example4 extends Example2{
	   public void display3(){
	      System.out.println("display3 method");
	   }
	}
	public class Demo_Abs_vs_Inheri{
	   public static void main(String args[]){
	       Example4 obj=new Example4();
	       obj.display3();
	   }
	}