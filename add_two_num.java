import java.util.Scanner;

public class add_two_num{

	public static void main(String args[]){

		Scanner sc =new Scanner(System.in);//this is a object

		int a;
		int b,sum;

	//asking the user for input
		System.out.println("enter the numbers to add:\n");
		
	//to get input we need to declare a new variable of class scanf
		a=sc.nextInt();
		b=sc.nextInt();


		sum=a+b;
		
		System.out.println("sum of these two are:"+sum);

	}


}