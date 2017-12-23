	import java.util.HashMap;
	import java.util.Scanner;
	
	class NumberToWord {
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			 int t = input.nextInt();
			 
			 while (t>0)
			 {
				 int n= input.nextInt();
				 int thousand = 0;
				 int hundred =0;
				 int decimal=0;
				 
				 decimal=n%100;
				 n=n/100;
				 
				 hundred=n%10;
				 
				 n=n/10;
				 thousand=n;
				 
				 String s= new String();
				 if(thousand>0)
				 {
					 s+=noToWord(thousand)+" thousand";
					 
				 }
				 
				 if(hundred>0)
				 {
					 if(thousand>0)
					 {
						 s+=" ";
					 }
					 s+=noToWord(hundred)+" hundred";
					 
				 }
				 
				 if(thousand>0 && hundred==0 && decimal>0)
				 {
					 s+=" and ";
				 }
				 
				 if(decimal>0)
				 {
					 if(hundred>0)
					 {
						 s+=" and ";
					 }
					 s+=noToWord(decimal);
				 }
					
				 System.out.println(s);
				 t--;
			 }
			
	           }
	
		private static String noToWord(int key) {
			// TODO Auto-generated method stub
			HashMap<Integer,String> dicktionary=new HashMap<Integer,String>();
			
			dicktionary.put(1, "one");
			dicktionary.put(2, "two");
			dicktionary.put(3, "three");
			dicktionary.put(4, "four");
			dicktionary.put(5, "five");
			dicktionary.put(6, "six");
			dicktionary.put(7, "seven");
			dicktionary.put(8, "eight");
			dicktionary.put(9, "nine");
			dicktionary.put(10, "ten");
			dicktionary.put(11, "eleven");
			dicktionary.put(12, "twelve");
			dicktionary.put(13, "thirteen");
			dicktionary.put(14, "forteen");
			dicktionary.put(15, "fifteen");
			
			for(int i=16;i<=19;i++)
			{
				if(i==14)
					dicktionary.put(14,"forteen");
				else
				dicktionary.put(i, dicktionary.get(i%10)+"teen");
			}
			dicktionary.put(20, "twenty");
			for(int i=21;i<=29;i++)
			{
				dicktionary.put(i, "twenty"+" "+dicktionary.get(i%10));
			}
			dicktionary.put(30, "thirty");
			for(int i=31;i<=39;i++)
			{
				dicktionary.put(i, "thirty"+" "+dicktionary.get(i%10));
			}
			dicktionary.put(40, "forty");
			for(int i=41;i<=49;i++)
			{
				dicktionary.put(i, "forty"+" "+dicktionary.get(i%10));
			}
			dicktionary.put(50, "fifty");
			for(int i=51;i<=59;i++)
			{
				dicktionary.put(i, "fifty"+" "+dicktionary.get(i%10));
			}
			
			dicktionary.put(60, "sixty");
			for(int i=61;i<=69;i++)
			{
				dicktionary.put(i, "sixty"+" "+dicktionary.get(i%10));
			}
			dicktionary.put(70, "seventy");
			for(int i=71;i<=79;i++)
			{
				dicktionary.put(i, "seventy"+" "+dicktionary.get(i%10));
			}
			
			dicktionary.put(80, "eighty");
			for(int i=81;i<=89;i++)
			{
				dicktionary.put(i, "eighty"+" "+dicktionary.get(i%10));
			}
			
			
			dicktionary.put(90, "ninety");
			for(int i=91;i<=99;i++)
			{
				dicktionary.put(i, "ninety"+" "+dicktionary.get(i%10));
			}
			
			
			return dicktionary.get(key);
		}
	}