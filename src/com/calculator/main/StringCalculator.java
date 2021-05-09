package com.calculator.main;

import java.util.regex.Pattern;

public class StringCalculator {
	
	public int add(String numbers) throws Exception
	{
	int sum=0;	
		if(numbers=="")
		{
			return 0;
		}
		String[] numb = new String[numbers.length()]; 
		
        String delimiter = ",";	
        if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/')
        {
       	 String delimiters = numbers.split("\n")[0];
            String secondDelimiter = null;
            delimiter = delimiters.substring(3, numbers.indexOf("]"));
            delimiters = delimiters.substring(numbers.indexOf("]") + 1);
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
            if (delimiters.charAt(0) == '[')
                secondDelimiter = delimiters.substring(1, delimiters.length() - 1);

            if (secondDelimiter != null)
            	numbers = numbers.replaceAll(Pattern.quote(secondDelimiter), delimiter);
           delimiter = Pattern.quote(delimiter);
       }
        numbers = numbers.replaceAll("\n",delimiter);
        numb = numbers.split(delimiter);
        
		try {
		 for (String c : numb)
	{
		
		
			if(Integer.parseInt(String.valueOf(c))<0) {
    			throw new Exception();
				
    		}
			 if(Integer.parseInt(String.valueOf(c))>=1000) {
     			continue;
     		}
			 sum = sum + Integer.parseInt(String.valueOf(c));		
		}
	
		 }
		catch(Exception ex){
			
			for(int i=0;i<numb.length;i++) {        				
                if (Integer.parseInt(numb[i]) < 0) {
                	String errMsg = "negatives not allowed ";
                	System.out.println(errMsg + numb[i]);
                }
    					
}
			
		}
		return sum;		
	}
	


}
