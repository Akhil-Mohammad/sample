//problrm to store 10 elements in an array and display them
import java.util.Scanner;
class ArrayProgram2

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[10];
		/*length is used to get the size of array nothing 
		but to get know how many elements can be stored in array*/
		System.out.println("Enter 10 Elements into the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();//accepting elements in different array blocks
		}
		System.out.println("the elements stored in the array are: " );
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
