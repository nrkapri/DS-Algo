import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWords {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 input.nextLine();
		 while (t>0)
		 {
		    String s=input.nextLine();

		    String revstr=new StringBuffer(s).reverse().toString();
		    char[] cstr=revstr.toCharArray();
		    int start=0;
		    for(int i=0;i<s.length();i++)
		    {
		    	if (cstr[i]=='.' || i==s.length()-1)
		    	{
		    		int x=i-1;
		    		if(i==s.length()-1)x=i;
		    		for(int j=start;j<x;j++)
		    		{
		    			char t1=cstr[j];
		    			cstr[j]=cstr[x];
		    			cstr[x]=t1;
		    			x--;
		    			
		    		}
		    		start=i+1;
		    	}
		    }
		    
		    System.out.println(cstr);
			 t--;
		 }
		
           }
}