import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int n;
		System.out.print("ENTER THE TERM: ");
		Scanner r= new Scanner(System.in);
		n = r.nextInt();

		for(int i =0; i<=n; i++){
			if(i%2==1){ //using the if function
				System.out.print( i+ " " );
			}
		}
	}
}

//can be more simple and optimal

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the Term: ");
		Scanner r =new Scanner(System.in);
		n =r.nextInt();
		for(int i=1; i<=n; i=i+2){
			System.out.print(i+" ");
		}
	}
}