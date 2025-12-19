import java.util.Scanner;

public class array{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter no of elements:");
		System.out.println();

		int n;
		n=sc.nextInt();
		int[] arr=new int[n];

		

		System.out.println();

		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();

		}

		System.out.println("Array is:");

		for(int i=0;i<n;i++){
			
			System.out.println(arr[i]);


		}

		//for target sum program
		int target;
		System.out.println("enter element to find in the array:");
		
		target=sc.nextInt();
		for(int i=0;i<n;i++){
			if(target==arr[i])
				System.out.println("target found at position "+i);

		System.out.println("target not found.");


}
		System.out.println("enter number to find the two sum to:");
		int twosum=sc.nextInt();

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]+arr[j]==twosum )
					System.out.println("Sum  found at indices "+i+" and"+j);


}	
		System.out.println("sum NOT FOUND IN ARRAY");


}

		System.out.println("the reversed array is:");

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr
					System.out.println("Sum  found at 					indices "+i+" and"+j);



		


}

}