import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter the numbers: ");
		Scanner r= new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();

		if(a>b){
			if(a>c){
				System.out.print("A is the greatest: "+a);
			}
			else{
				System.out.print("C is the greatest: "+c);
			}
		}
      else{
      	System.out.print("B is the greatest: "+b);
      }
	}
}