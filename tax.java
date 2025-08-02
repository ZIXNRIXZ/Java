import java.util.Scanner;
class A{
	public static void main(String[] args) {
		int sal;
		double tax;
		System.out.print("Enter Salary: ");
		Scanner r= new Scanner(System.in);
		sal = r.nextInt();

		if(sal<=100000){ 
			System.out.print("For Salary of  "+sal+ " No Tax");
		}
		else if(sal>100000 && sal<300000){
			 tax=sal*0.15;
			System.out.print("For salary of  " +sal+ " 15% Tax to be paid that is " +tax);
		}
		else if(sal>300000 && sal<500000){
			tax=sal*0.20;
			System.out.print(sal+ " 20% Tax to be paid that is "+tax);}
		else{
			System.out.print("For " +sal+ " more than 30% Tax to be paid");
		}
	}
}