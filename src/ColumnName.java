import java.util.Scanner;

class ColumnName {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			long n= input.nextLong();

			System.out.println(toColumnName(n));

			t--;
		}

	}

	private static String toColumnName(long n) {
		// TODO Auto-generated method stub
		String s=new String();

		char[] carr= new char[100];
		int length=0;
		while(n>0)
		{
			//s=s+""+(n%26);
			
			long rem= n%26 ;
			if(rem==0)
			{
				carr[length++]='Z';	
				n=(n/26) -1;
			}
			else
			{
			    	carr[length++]=(char) ('A'-1+rem);
			    	n=n/26;
			}
		}

		for(int i=0;i<length;i++)
		{
			s+=carr[i];
		}

		return new StringBuilder(s).reverse().toString();
	}
}