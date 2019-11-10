package log4jDemo;

import java.util.Scanner;

public class NumberTriangle {
	
	public static void main(String args[]) {
		int maxno,rowno = 1,i,j,k;
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter any number:");
		maxno=input.nextInt(); 
		for(i=1;i<maxno;)
		{
			
			for(k=maxno;k>=rowno;k--)
			{
				System.out.print(" ");
			}
			
			if(maxno>i+rowno)
			{
								
				for(j=1;j<=rowno;j++)
				{
					
					System.out.print(i);
					i=i+1;
				}
				
			}else
			{
				break;
			}
			
			
			System.out.println();
			rowno=rowno+1;
		}
		
		
	
	}

}
