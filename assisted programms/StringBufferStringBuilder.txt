package assignProj;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Welcome to Java!");
		s1.append("here is the coversion of strings using string buffer and string buider");

		System.out.println(s1);

		StringBuffer sb1 = new StringBuffer("uma!");
		StringBuffer sb = new StringBuffer("uma!");
		sbr.reverse();

		System.out.println("String to StringBuffer");
		System.out.println(sb);

		StringBuilder sb2= new StringBuilder(sb);
		System.out.println("String to StringBuilder");
		System.out.println(sb2);
	}
}
