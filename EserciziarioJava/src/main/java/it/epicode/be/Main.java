package it.epicode.be;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;

public class Main {

	private int i = 6;
	private int j = i;
	
	public Main() {
		i = 5;
	}
	
	public static void eat() throws IOException {
		try {
			System.out.println("1");
			throw new IOException();
		} catch(IOException e) {
			throw e;
		}
	}
	
	public static void play()  {
		try {
			System.out.println("1");
			throw new RuntimeException();
		} catch(RuntimeException e) {
			throw e;
		}
	}
	
	public static void sleep()  {
		System.out.println("1");
		throw new Error();
		
//		try {
//			System.out.println("1");
//			throw new Error();
//		} catch(Error e) {
//			throw e;
//		}
	}
	
	public static void main(String args[]) {
//	    int s = 10;/*w  w w  .  j  a  va 2 s .c o m*/
//	    anotherMethod(s);
//	    System.out.println(s);
//	    someMethod(s);
//	    System.out.println(s);
//	    
//	    String[] os = new String[] { "Mac", "A", "Linux", "Windows" };
//	    Arrays.sort(os);
//	    System.out.println(Arrays.binarySearch(os, "Mac"));
		
		//new R(1, 2);
		
		Main m = new Main();
		System.out.println(m.i + " " + m.j);
		
//		try {
//			eat();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//play();
		//sleep();
		
		Date date = new Date();
		
		String[] grades;
		grades = new String[] {"a", "b", "c", "d"};
		//grades = ; 	
		int a = 1;
		boolean bo = ++a == 1;
		System.out.println(bo);
		System.out.println(a);
		boolean ma = a++ == 2;
		System.out.println(ma);
		System.out.println(a);
		
		Period p = Period.ofDays(1);
		//LocalDate d = LocalDate.now().plus(1, p);
		
		double d = new Double(1000.0);
	  }

	  static void someMethod(int val) {
	    ++val;
	    System.out.println(val);
	  }

	  static void anotherMethod(int val) {
	    val = 20;
	    System.out.println(val);
	  }
	  
//	  public Main() {
//		  System.out.println("1");
//	  }
		
}

class R extends Main {
	public R(int age) {
		this(8, 9);
		System.out.println("3");
	}
	
	public R() {
		this(2);
		System.out.println("4");
	}
	
	public R(int a, int b) {
		
		System.out.println("5");
	}
}
