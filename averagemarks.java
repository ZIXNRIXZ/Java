//calculate the average marks of 5 subject
import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner r= new Scanner(System.in);
		System.out.print("Enter Maths Marks: ");
		a=r.nextInt();
		System.out.print("Enter Physics Marks: ");
		b=r.nextInt();
		System.out.print("Enter Chemistry Marks: ");
		c=r.nextInt();
		System.out.print("Enter English Marks: ");
		d=r.nextInt();
		System.out.print("Enter Elective Marks: ");
		e=r.nextInt();
		int sum = a+b+c+d+e;
	    System.out.println("Total accumulated marks: " +sum);

	    double avg = sum/5.0;
	    System.out.println("Average marks of 5 subjects: " +avg);
	}
}