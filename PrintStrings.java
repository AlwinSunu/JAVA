import java.util.Scanner;

public class PrintStrings{

	public static void main(String args[]){

		Scanner =new Scanner(System.in);

		int a,b,c,avg;

		System.out.println("ENTER THREE INPOUTS TO FIND THE AVERAGE:");

		a=Scanner.nextInt();
		b=Scanner.nextInt();
		c=Scanner.nextInt();

		avg=(a+b+c)/3;

		System.out.println("AVERAGE IS:"+avg);


	}
}