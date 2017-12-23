import java.util.Scanner;

class TinyURL {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			//BigInteger n= new BigInteger(input.nextLine());
			long n=input.nextLong();
			String str=idToShortURL(n);
			System.out.println(str);
			System.out.println(shortURLtoID(str));

			t--;
		}

	}
	
	
	// Function to generate a short url from intger ID
	static String idToShortURL(long  n)
	{
	    // Map to store 62 possible characters
	    String m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	 
	    char[] map=m.toCharArray();
	    String shorturl=new String();
	 
	    // Convert given integer id to a base 62 number
	    while (n>0)
	    {
	        // use above map to store actual character
	        // in short url
	        shorturl+=map[(int) (n%62)];
	        n = n/62;
	    }
	 
	    // Reverse shortURL to complete base conversion
//	    reverse(shorturl.begin(), shorturl.end());
	 
	    
	    return new StringBuilder(shorturl).reverse().toString();
	}
	 
	// Function to get integer ID back from a short url
	static long shortURLtoID(String s)
	{
	    long id = 0; // initialize result
	 
	    char[] shortURL= s.toCharArray();
	    // A simple base conversion logic
	    for (int i=0; i < s.length(); i++)
	    {
	        if ('a' <= shortURL[i] && shortURL[i] <= 'z')
	          id = id*62 + shortURL[i] - 'a';
	        if ('A' <= shortURL[i] && shortURL[i] <= 'Z')
	          id = id*62 + shortURL[i] - 'A' + 26;
	        if ('0' <= shortURL[i] && shortURL[i] <= '9')
	          id = id*62 + shortURL[i] - '0' + 52;
	    }
	    return id;
	}
	 
}