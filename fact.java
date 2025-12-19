import java.util.Scanner;

public class fact{



	static int fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		
	}
	return fact;
}



	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter no :");
		System.out.println();
	int n;
	n=sc.nextInt();
	int a=fact(n);
	System.out.println(a);






		}
}