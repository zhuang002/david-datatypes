import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//intSample();
		//doubleSample();
		//booleanSample();
		//compareSample();
		// stringSample();
		// charSample();
		arraySample();
		//loopSample();

	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		int[] ar1 = {1,2,3,4,5,6};
		System.out.println(ar1[1]+","+ar1[5]);
		
		char[] ar2 = {'A', 'd', 'F', 'g'};
		System.out.println(ar2[0]+","+ar2[3]);
		
		String[] ar3 = {"I", "am a", "Teacher", "Student", "!", "."};
		System.out.println(ar3[0]+" "+ar3[1]+" "+ar3[2]+ar3[4]);
		System.out.println(ar3[0]+" "+ar3[1]+" "+ar3[3]+ar3[5]);
		
		int[] ar4=null;
		ar4 = new int[5];
		System.out.println("length of ar4 is:"+ar4.length);
		for (int i=0;i<ar4.length;i++) { // for(init;condition;update), i++ --> i+=1 -->i=i+1
			System.out.print(ar4[i]+",");
		}
		System.out.println();
		
		ar4[0] = 100;
		ar4[3] = 20;
		ar4[4] = 15;
		
		for (int i=0;i<ar4.length;i++) { // for(init;condition;update), i++ --> i+=1 -->i=i+1
			System.out.print(ar4[i]+",");
		}
		System.out.println();
		
		int start = 123;
		for (int i=0;i<ar4.length;i++) {
			ar4[i] = start;
			start += 5; // start = start+5;
		}
		
		for (int i=0;i<ar4.length;i++) { // for(init;condition;update), i++ --> i+=1 -->i=i+1
			System.out.print(ar4[i]+",");
		}
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'b';
		
		String s = "adfsafdsa+++";
		s = s+c1;
		
		System.out.println(s);
		s += c2;
		System.out.println(s);
		
		char c3=s.charAt(10);
		System.out.println(c3);
		
		System.out.println(c1-c2);
		System.out.println(c1+c2);
		System.out.println("here it is:"+c1);
		System.out.println("there it is:"+c1+c2);
		System.out.println("Now you see what:"+(c1+c2));
		
		// print the ascii code for '*'
		int i1 = '*';
		System.out.println((int)'*');
		System.out.println(i1);
		
		// print 10th character after letter 'D'
		c1 = 'D'+10;
		System.out.println((char)('D'+10));
		System.out.println(c1);
		
		c2 = 44;
		System.out.println(c2);
		
		c1 = '我';
		System.out.println(c1);
		System.out.println((int)c1);
		
		// print 120th character after 'T', wrap around after 'Z';
		System.out.println((char)('T'+120));
		System.out.println( (char)((('T'-'A')+120)%26+'A') );
		// take 'A' as the starting point, we calculate the offset. 
		int offsetToA = 'T'-'A'; // offset of 'T';
		offsetToA += 120;  // offset of target character.
		offsetToA %= 26;   // we have 26 characters, we need to wrap around.
		c1 = (char) ('A'+offsetToA); // get the target character asscii code;
		System.out.println(c1);
		
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
