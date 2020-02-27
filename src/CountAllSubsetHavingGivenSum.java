import java.util.*;
import java.lang.*;
import java.io.*;
/**
Input:
2
6
2 3 5 6 8 10
10
5
1 2 3 4 5
10

Output:
3
3
*/
class CountAllSubsetHavingGivenSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n =  input.nextInt();
			 
			 int [] arr = new int[n];
			 
			 for ( int i=0; i<n; i++){
			     arr[i] = input.nextInt();
			 }
             int sum = input.nextInt();
             
             
			 // c(n,sum) = c(n-1,sum -  a[n]) + c(n1,sum)
			 
			 int [][] tab = new int [n+1][sum+1];
			 
			 for ( int i=0; i<=n; i++){
			     tab[i][0] = 1;
			 }
			 
			 for ( int i=1; i<=n; i++){
			     for( int j=1; j<=sum;j++){
			         int a = 0;
			         int b = 0;
			         
			         if(j - arr[i-1] >= 0)  
			            a = tab[i-1][j -arr[i-1]];
			         
			         b = tab[i-1][j];
			         
			         tab[i][j] =  a+b;
			         
			        // System.out.println("i:"+",j:"+j+",a:"+a+",b:"+b);
			         //System.out.println("Array:"+Arrays.deepToString(tab));
			     }
			 }
			 System.out.println(tab[n][sum]);
			 
			 
			 
			 t--;
		 }
		
    }
}