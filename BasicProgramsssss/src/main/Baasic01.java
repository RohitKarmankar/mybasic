package main;

public class Baasic01 {

	public void nonstaticmethod() {
	System.out.println("non static method");
	}
	public static void staticmethod() {
	System.out.println("static method");	
	}
	public void secondnonstaticmethod() {
	System.out.println("second non static method");	
	}
	public static void secondstaticMethod() {
	System.out.println("second static method");	
	}
	public static void fourthstaticMethod() {
	System.out.println("fourth static method");	
	}
	public static void main(String[] args) {
		Baasic01 kk=new Baasic01();
		kk.nonstaticmethod();
		staticmethod();
		secondstaticMethod();
		fourthstaticMethod();
	}
}
