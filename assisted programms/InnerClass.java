 public class InnerClass {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
            System.out.println(msg+", Let us start learning Inner Classes");
       }  
	 }  


	public static void main(String[] args) {

		innerClass obj=new innerClass();
		innerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class innerClass2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClass2  sc=new innerClass2 ();  
	sc.display();  
	}
}


//anonymous inner class
abstract class SpecialInnerClass {
	   public abstract void display();
	}


	public class innerClass3 {

	public static void main(String[] args) {
	SpecialInnerClass i = new SpecialInnerClass() {

	         public void display() {
	            System.out.println(" Inner Class");
	         }
	      };
	      i.display();
	   }
	}
