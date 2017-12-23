import java.util.Scanner;

class ValidTicTac {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t =input.nextInt();
		input.nextLine();
		
		while (t>0)
		{
			char [][] arr=new char [3][3];

			int xcount=0;
			int ocount=0;

			String str=input.nextLine();


		//	System.out.println(str);
			int count=0;
			int  xwin=0;
			int owin=0;
			for (int i =0;i<3;i++)
			{
				int xlCount=0;
				int olCount=0;
				for (int j=0;j<3;j++)
				{

			//		System.out.println("ij:"+i+","+j);
					arr[i][j]=str.charAt(count);
					count+=2;
					if (arr[i][j]=='X')
					{
						xcount++;
						xlCount++;
					}

					if (arr[i][j]=='O')
					{
						ocount++;
						olCount++;
					}
				}

				if (xlCount >=3) xwin++;
				if (olCount >=3) owin++;
			}

			for (int i=0;i<3;i++)
			{
				int xlcount=0;
				int olcount=0;
				for(int j=0;j<3;j++)
				{
					if(arr[j][i]=='X')
					{
						xlcount++;
					}
					if(arr[j][i]=='O')
					{
						olcount++;
					}
				}
				if (xlcount >=3) xwin++;
				if (olcount >=3) owin++;
			}

			if (arr[0][0]==arr[1][1] &&  arr[1][1]==arr[2][2] && arr[2][2]=='X') xwin++;
			if (arr[0][0]==arr[1][1] &&  arr[1][1]==arr[2][2] && arr[2][2]=='O') owin++;

			if (arr[0][2]==arr[1][1] &&  arr[1][1]==arr[2][0] && arr[2][0]=='X') xwin++;
			if (arr[0][2]==arr[1][1] &&  arr[1][1]==arr[2][0] && arr[2][0]=='O') owin++;

			if ( Math.abs(xcount -ocount) >1  || ocount>xcount)
			{
				System.out.println("Invalid");
			}
			else if (xwin>0 &&  owin >0)
			{
				System.out.println("Invalid");
			}
			else if (xwin>1)
			{
				System.out.println("Invalid");
			}
			else if (owin>1)
			{
				System.out.println("Invalid");
			}
			else 
			{
				System.out.println("Valid");
			}
			t--;
		}
	}
}