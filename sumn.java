//sum of n natural number
import java.util.Scanner;
class A{
	public static void main(String[] args) {
	int n, sum=0;
	System.out.print("Enter number of term: ");
	Scanner r = new Scanner(System.in);
	//i =r.nextInt();
	n =r.nextInt();
	 	for(int i=1; i<=n; i++)
	 	{
	 		sum = sum+i;
	 	}
	 	System.out.print("ADD "+ sum);
	 	}
	}

// while loop
	import java.util.Scanner;
class A{
	public static void main(String[] args) {
	int n,i =0, sum=0;
	System.out.print("Enter number of term: ");
	Scanner r = new Scanner(System.in);
	//i =r.nextInt();
	n =r.nextInt();
	while(i<n)
	{
		i++;
		sum =sum+i;

	}
	System.out.print("ADD "+ sum);}}

	//do whille loop

	import java.util.Scanner;
	class A{
		public static void main(String[] args) {
			int n, i=0, sum=0;
			System.out.print("Enter the term ");
			Scanner r= new Scanner(System.in);
			n =r.nextInt();
			do{
				i++;
				sum=sum+i;
				
			}while(i<n);
			System.out.print("ADD " +sum);
		}
	}