import java.util.Scanner;
public class SortMethods
{
	public static void main(String[] args) 
	{
		//Scanner jt=new Scanner(System.in);
		int[] a={1,6,5,2,3};

		//bubble sort

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		for(int b : a) //print by for-each loop
		{
			System.out.print(b);
		} 

		//selction sort

		// for(int i=1;i<a.length-1;i++)
		// {
		// 	int temp=i;
		// 	for(int j=i+1;j<a.length;j++)
		// 	{
		// 		if(a[j]<a[temp])
		// 		{
		// 			temp=j;
		// 		}
		// 	}
		// 	a[i]=a[temp]^a[i];
		// 	a[temp]=a[temp]^a[i];
		// 	a[i]=a[temp]^a[i];
		// }
		// for(int b : a)
		// {
		// 	System.out.print(b);
		// } 

		//insertion sort

		// for(int i=0;i<a.length;i++)
		// {
		// 	int current=a[i];
		// 	int j=i-1;
		// 	while(j>=0 && current<a[j])
		// 	{
		// 		a[j+1]=a[j];
		// 		j--;
		// 	}
		// 	a[j+1]=current;
		// }
		// for(int b : a)
		// {
		// 	System.out.print(b);
		// }
	}
}