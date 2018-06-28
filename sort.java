//sorting array//
import java.io.*;
import java.util.Scanner;
class sort
{
	public static void main(String args[])
	{
	int t,n,i,j,temp;
	int[] s=new int[100];
	Scanner a=new Scanner(System.in);
	System.out.println("enter number");
	t=Integer.parseInt(a.nextLine());
	while(t!=0)
	{
		System.out.println("enter array size");
	        n=Integer.parseInt(a.nextLine());
		for(i=0;i<n;i++)
		{
			s[i]=Integer.parseInt(a.nextLine());
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i]>s[j])
				{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			    	}
			}
		}
	  	for(i=0;i<n;i++)
		{
		System.out.println(s[i]);
		}
  	t--;
	}
	}
}
			
		
