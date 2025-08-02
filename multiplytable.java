import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int num;
		System.out.print("Multiplication table of: ");
		Scanner r= new Scanner(System.in);
		num= r.nextInt();

		for(int i=1; i<=20; i++){
          System.out.println(num+ "*"+i+ " = " + num*i);     
		}
		
	}
}