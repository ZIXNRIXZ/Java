//print ascii value of the input character

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int ch;
		System.out.print("Enter Character ");
        Scanner r = new Scanner(System.in);
        ch=r.next().charAt(0);

        int a = ch;
        System.out.print("Ascii value of " +ch + " is " +a);
	}
}