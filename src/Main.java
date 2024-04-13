import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//intSample();
		//doubleSample();
		//booleanSample();
		//compareSample();
		stringSample();
		//charSample();
		//loopSample();

	}

	private static void stringSample() {
		/*
		 * String is a class type. It has only one built in operation: +, 
		 * 	which is to concatenate strings.
		 * String has many methods.
		 */
		
		String s1 = "I am a ";
		String s2 = "Student";
		String s3 = "Teacher";
		
		
		
		System.out.println(s1+s2.toLowerCase()+".");
		System.out.println(s1+s3.toUpperCase()+".");
		
		System.out.println(s1+s2+".");
		System.out.println(s1+s3+".");
		
		// method charAt();
		String s = "afaslfkads'fkads'fklasfjadslfakh;fsadkl;fjas";
		System.out.println("The 10th, 13th, 21th characters in s are:"
				+s.charAt(10)+","+s.charAt(13)+","+s.charAt(21));
		char c = s.charAt(40);
		System.out.println("the 40th character of s is :" +c);
		
		// method indexOf(), lastIndexOf();
		int index = s.indexOf("as");
		System.out.println("index of 'as' is : "+ index);
		index = s.lastIndexOf("as");
		System.out.println("last index of 'as' is : "+ index);
		index = s.indexOf("student");
		System.out.println("index of 'student' is : "+ index);
		
		// find all 'as' in s. string.length();
		String ss = "as";
		index = s.indexOf(ss);
		while (index>=0) {
			System.out.println("index="+index);
			index += ss.length(); // index = index + ss.length()
			index = s.indexOf(ss, index);
		}
		
		// string.substring();
		System.out.println("substring of s from index 3 to 20:"+s.substring(3,20));
		
		
		
		
		
		
		
	}

	private static void compareSample() {
		/*
		 * comparison is to compare the value of 2 variables of same type, 
		 * and then return the comparison result of boolean type.
		 * Comparison has following operations:
		 * 	== : equal
		 *  <= : less or equal
		 *  >= : great or equal
		 *  >  : greater than
		 *  <  : less than
		 *  != : not equal
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input integer a,b,c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.println("a==b :" + (a==b));
		System.out.println("a>b :" + (a>b));
		System.out.println("!(a>=b) :" + !(a>=b));
		System.out.println("a<b : " + (a<b));
		boolean b1 = (a==b) || (b==c) && (a==c);
		boolean b2 = (a!=b) && (b>c || c<a);
		
		System.out.println("(a==b) || (b==c) && (a==c) :"+b1);
		System.out.println("(a!=b) && (b>c || c<a) :"+b2);
		
		
	}

	private static void booleanSample() {
		/*
		 * boolean type contains only 2 values: true , false.
		 * boolean type has operations: &&(and), ||(or), !(not)
		 * && : a && b equals true only when both a and b are true, otherwise false.
		 * || : a || b equals false only when both a and b are false, otherwise true.
		 * !  : !a equals false when a is true; equals true when a is false.
		 * 
		 * boolean operation priority: ! > && > ||
		 */
		
		boolean a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a and b:");
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		
		sc.close();
		
		System.out.println("a="+a+";b="+b);
		
		System.out.println("a && b=" + (a&&b));
		System.out.println("a || b=" + (a||b));
		System.out.println("!a="+(!a));
		System.out.println("!b="+(!b));
		
		System.out.println("!(a&&b)||!b="+(!(a&&b)||!b));

		
		
		
	}

	private static void doubleSample() {
		double a = 321.45253;
		double b = 98.344;
		
		double result = a+b;
		System.out.println("a+b="+result);
		
		result = a-b;
		System.out.println("a-b="+result);
		
		result = a*b;
		System.out.println("a*b="+result);
		
		result = a/b;
		System.out.println("a/b="+result);
		
		result = a%b; // a%b means a mod b
		System.out.println("a%b="+result);
		
		result = (int)(a/b);
		System.out.println("a-b*(a/b)="+(a-b*result));
		
		int iResult = (int) (a/b); // cast double to integer
		System.out.println("a/b="+iResult);
		
		int i=4324213;
		int j=343;
		
		result = i/j;
		iResult = i/j;
		System.out.println("result(i/j)="+result);
		System.out.println("iResult(i/j)="+iResult);
		
		result = (double)i/(double)j; //cast int to double.
		System.out.println("result((double)i/(double)j)="+result);
		
		System.out.println("3/5.0="+(3/5.0));
		System.out.println("5.0/3="+(5.0/3));
		
	}

	private static void intSample() {
		int a = 2342;
		int b = 908;
		
		int result = a+b;
		System.out.println("a+b="+result);
		
		result = a-b;
		System.out.println("a-b="+result);
		
		result = a*b;
		System.out.println("a*b="+result);
		
		result = a/b;
		System.out.println("a/b="+result);
		
		System.out.println("-5/2="+(-5/2));
		
		result = a%b; // a%b means a mod b
		System.out.println("a%b="+result);
		
		System.out.println("-5%3="+(-5%3));
		
	}

}
