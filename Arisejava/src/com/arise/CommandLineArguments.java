package com.arise;

import java.util.*;

public class CommandLineArguments {

	public static void main(String[] args) {
		int c=0;
		
		
		
		for(int j=1 ; j<=100 ; j++)
		{
			for(int i=1 ; i<=j ; i++)
			{
				if(j%i==0)
				{
					c++ ; 
				}
				
			}
			if(c==2)
			{
				System.out.println("" + j);
			}
			c=0 ;
			
		}
		
		
		
		
		
	}

}
