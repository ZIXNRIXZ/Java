/**import java.util.Scanner;
class UserInput
{
	public static void main (String c[])
	{
		int a;
	    Scanner obj=new Scanner(System.in);
	    System.out.print("Enter Input");
	    a=obj.nextInt();
	    System.out.print(a);
	}
*/

/**class A
{
	static int b=20;
	 int c=50;
	public static void main(String[] args) {
		int a = 10;
      A ref=new A();
      System.out.println(a);
      System.out.println(A.b);
      System.out.println(ref.c);
	}
}*/

/**class A
{
	int a= 25;
	void fun()
	{
		int b=25;
		System.out.println(a+" "+b);
		--a; ++b;
	}
	public static void main(String d[])
	{
		A r=new A();
		r.fun();
		r.fun();
	}
}*/

//implicit typecasting
/**class A
{
	 public static void main(String[] args) {
		int a=10;
		double b=a;
		System.out.print(b);
	}
}*/
//explicit typecasting
/**class A
{
	public static void main(String[] args) {
		double a=25.5;
		int b = (int)a;
		System.out.print(b);

		
	}
}*/
/**import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		String a;
		System.out.print("Enter data");
		Scanner obj=new Scanner(System.in);
		a=obj.nextLine();
		System.out.print("Get data"+a);
	}
}*/
 /**class A
 {
 	public static void main(String[] args) {
 		int a=10, b=20;
 		int c =45;
 		 ++b;
 		int d = a+b;
 		++d;
 		System.out.print(d);

 	}
 }*/
/**import java.util.Scanner;
 class A
 {
 	public static void main(String[] args) {
 		int x,y;
 		System.out.print("Enter two number");
 		Scanner obj= new Scanner(System.in);
 		x=obj.nextInt();
 		y=obj.nextInt();
 		int c= x*y;
 		System.out.println("Addition"+(x+y));
 		System.out.println("Addition"+(x-y));
 		System.out.println("Addition"+( x*y));
 		

 	}
 }*/

   /**import java.util.Scanner;
   class A
   {
   	public static void main(String[] args) {
   		int a,b;
       System.out.print("Enter two number");
       Scanner obj=new Scanner(System.in);
       a= obj.nextInt();
       b= obj.nextInt();
       System.out.println("true/false: "+(a<b));
       System.out.println("true/false: "+(a>b));
       System.out.println("true/false: "+(a>=b));
       System.out.println("true/false: "+(a<=b));


   	}
   }*/

   /**import java.util.Scanner;
   class A{
   	public static void main(String[] args) {
   		double a=10;
   		double b= 24;
   		System.out.println(a);
   		System.out.println("Prepost incr");
   		System.out.println(a++);
   		System.out.println(++a);
   		System.out.println(b);
   		System.out.println("Prepost dcr");
   		System.out.println(b--);
   		System.out.println(--a);
     }
   }*/

   /**class S
   {
   	public static void main(String[] args) {
   		
     int a=10, b=20,Max, Min;
     Max=(a>b) ? a:b;
     Min=(a<b) ? a:b;
     int c= Min*Max;
     System.out.println(Max);
     System.out.println(Min);
     System.out.println(c);
   	}
   }*/

   /**class A
   {
   	public static void main(String[] args) {
   		int a=245, b=343, c=434, Max, Min;
       Max= (a>b) ? (a>c ? a : c) : (b>c ? b : c);
       Min= (a<b) ? (a<c ? a : c) : (b<c ? b : c);
       double M = ((Max*Min)/ (Max+Min)); 
       System.out.println("The maximum value is " +Max);
       System.out.println("The Minimum Value is "+Min);
       System.out.println("The core Value is" +M);
   	}
   }*/
/**import java.util.Scanner;
   class A
   {
   	public static void main(String[] args) {
   	int a,b;
   	System.out.println("Enter a and b: ");
   	Scanner obj=new Scanner(System.in);
   	a= obj.nextInt();
   	b= obj.nextInt();
   	System.out.println("AND "+(a & b));  	
   	System.out.println("OR "+(a | b)); 
   	System.out.println("XOR "+(a ^ b)); 
   	System.out.println("COMPLEMENT "+(~a)); 
   	}
   }*/
/**import java.util.Scanner;
   class A
   {
   	public static void main(String[] args) {
   	  int num;
   	  System.out.println("Enter Number");
   	  Scanner obj=new Scanner(System.in);
   	  num= obj.nextInt();
   	   if(num % 2==0){
   	   	System.out.println("The number is Even");
   	   }
   	   else{
   	   	System.out.println("the number is Odd");
   	   }
   	  

   	}
   }*/
/**import java.util.Scanner;
   class A
   {
   	public static void main(String[] args) {
   		int a,b;
   		System.out.println("Enter the value of A and B");
   		Scanner r=new Scanner(System.in);
          a = r.nextInt();
          b = r.nextInt();

   		if(a>b){
   			System.out.println("a is greater than B");

   		}
   		else if(a<b){
   			System.out.println("b is greater than a");
   		}
   		else if(a==b){
   			System.out.println("a is equal to b");
   		} else{
   			System.out.println("a and b are invalid");
   		}

   	}
   }*/
/**import java.util.Scanner;
   class A {
   	public static void main(String[] args) {
   		int a,b,c,d;
   		System.out.println("Enter you choice: ");
   		Scanner r=new Scanner(System.in);
   		a =r.nextInt();
   		b =r.nextInt();
   		c =r.nextInt();
   		d =r.nextInt();

   		if(a>b) {
   			     if(a>c){
   			     	System.out.println("The value of A "+a);}
   			     	else { 
                     System.out.println("The value of C "+c);
   			     	}
   			     }
   			 else
   			  {
   			 	if(b>c) {
   			 		System.out.println("The value of B "+b);
   			 	}

   			 	else if(a+b+c==d){
   			 		System.out.println("The value of D "+d);
   			 	}
   			 }
   			}
   		}*/

   		/**import java.util.Scanner;
   		class A{
   			public static void main(String[] args) {
   				 int a,b,s;
   				 System.out.println("Enter your choice");
   				 Scanner r=new Scanner(System.in);
   				 s= r.nextInt();
   				  a= r.nextInt();
   				   b= r.nextInt();
   				   switch(s){
   				   case 1: System.out.println("Sum is: " + (a+b));
   				   	break;
   				   	case 2: System.out.println("Sub is: " + (a-b));
   				   	break;
   				   	case 3: System.out.println("Multiply is: " + (a*b));
   				   	break;
   				   	case 4: System.out.println("Division is: " + (b%a));
   				   	break;
   				   default: System.out.println("Invalid choice!....");
   				   }
   			}
   		}*/
/**import java.util.Scanner;
   		class A
   		{
   			public static void main(String[] args) {
   				int n;
   				System.out.print("Enter VAlue for condition \n");
   				Scanner r =new Scanner(System.in);
   				n =r.nextInt();

   				while(n<11){
   					System.out.println("Java is God Level");
   					++n;
   				}
   			}
   		}*/


   /**import java.util.Scanner;
   class A{
   	public static void main(String[] args) {
   		int n;
   		System.out.print("Enter the value of n:  ");
   		Scanner r= new Scanner(System.in);
   		n = r.nextInt();

   		do{
   			System.out.println(" " +n);
   			++n;
   		}
   		while(n<=10);
   	}
   }*/

   /**import java.util.Scanner;
   class A{
   {
   	public static void main(String[] args) {
   	  int a;
   	  Scanner r =new Scanner(System.in);
   	  a = r.nextInt();
   	   for(a=0,a<=10, a++){
   	   	System.in.println("java");
   	   }
   	}
   }*/

   import java.util.Scanner;
   class A{
   	public static void main(String[] args) {
   		int n,i;
   		System.out.println("Enter the choice: ");
   		Scanner r = new Scanner(System.in);
   	  n = r.nextInt();
   	    for(i=n;i<=10.; i++){
   	    	System.out.println("For it is");
   	    }

   	}
   }