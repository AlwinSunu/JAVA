import java.util.Scanner;

public class sumn{



	static int sum(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum+=i;
		
	}
	return sum;
}



	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter no :");
		System.out.println();
	int n;
	n=sc.nextInt();
	int a=sum(n);
	System.out.println(a);






		}
}