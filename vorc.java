// character is vowel or consonent

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		char ch;
		System.out.print("Enter any character ");
		Scanner r = new Scanner(System.in);
		ch=r.next().charAt(2);
		if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.print("CHaracter is a vowel ");
		}
	
	else
	{
		System.out.print("Character is consonent ");
	}
}
}