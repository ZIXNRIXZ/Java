/**class A{
	public static void main(String[] args) {
		for(char i='A'; i<='Z';i++)
		{
			System.out.print(i+ " ");
		}
	}
}*/
//greater/maximum of two numbers

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int n,m;
		System.out.print("Enter two number: ");
		Scanner r =new Scanner(System.in);
		n= r.nextInt();
		m= r.nextInt();

		if(n>m){
			System.out.print(n);
		}
		else{
			System.out.print(m);
		}
	}
}