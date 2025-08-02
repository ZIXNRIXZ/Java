//calculate the power
import java.util.Scanner;
class A{
	public static void main(String[] args) {
		 int n,m, result=1;
		 System.out.print("Enter number: ");
         Scanner r= new Scanner(System.in);
         n =r.nextInt();
         System.out.print("Enter Power: ");
         m = r.nextInt();
         for(int i=0;i<m;i++)
         {
         	result=n*result;
         } 
         System.out.print ("Power " +result); 
	}
}