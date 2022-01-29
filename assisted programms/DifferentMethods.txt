package Assignments.com;

public class DifferentMethods {
	public static void main(String[] args) {
		int addition= addition(3,4);
		System.out.println("The addition of 3 and 4 is "+ addition);
		
		System.out.println();
		
		
		callingMethod cal= new callingMethod();
		
		System.out.println("Call by value Before is "+cal.value);
		cal.change(100);
		System.out.println("Call by value after is "+cal.value);
		
		System.out.println();
		
		area(3,4);
		
		area(4);
	}
	
	static int addition(int x, int y){
		
		return x+y;
	
	}
	
	static void area(int x, int y) {
		System.out.println("The area of rectangle is "+ (x*y));
	}
	static void area(int x) {
		System.out.println("The area of square is "+ (x*y));
	}

}

class callingMethod{
	int value=150;
	
	int change(int value) {
		this.value=value + 150;
		return this.value;
	}
}