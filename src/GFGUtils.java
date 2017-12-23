import java.util.concurrent.TimeUnit;

public class GFGUtils {

	static void printarr(int[][] arr, int n, int m) {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nArray is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println("  ");
		}
	}

	public static void printarr(int[] table) {
		// TODO Auto-generated method stub
		System.out.println("\n Array is:");
		for(int i=0;i<table.length;i++)
		{
			System.out.print(table[i]+"  ");
		}
		
	}
}
