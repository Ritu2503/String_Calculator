package com.calculator.main;

public class StringCalculator {
	
	public int add(String numbers)
	{
	int sum=0;	
		if(numbers=="")
		{
			return 0;
		}
		
		char[]ch= new char[numbers.length()];
		for(int i=0;i<numbers.length();i++)
		{
		ch[i]=numbers.charAt(i);
		}
		 for (char c : ch)
	{
		if (Character.isDigit(c))
		{
			int a= Integer.parseInt(String.valueOf(c));
		sum= sum + a;
		
		}
	}
		return sum;		
	}
	

}
