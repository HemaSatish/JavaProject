package Java.Sample;

public class IntergersToWords {

	// Java program to print a given number in words. The 
			// program handles numbers from 0 to 999

	public static  void convertIntegersToWords(char[] num)
	{
		
			int len = num.length; 
 
			if (len > 3) 
			{ 
				System.out.println("Length more than 3 is not supported"); 
				return; 
			} 

		
			String[] single_digits = new String[]{ "", "one", 
												"two", "three", "four", 
												"five", "six", "seven", 
													"eight", "nine"}; 

			String[] two_digits = new String[]{"", "ten", "eleven", "twelve", 
												"thirteen", "fourteen", 
												"fifteen", "sixteen", "seventeen", 
												"eighteen", "nineteen"}; 

			
			String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", 
													"fifty","sixty", "seventy", 
													"eighty", "ninety"}; 

			String[] tens_power = new String[] {"hundred"}; 

			/* Used for debugging purpose only */
			System.out.print("Number in word : "); 

			/* For single digit number */
			if (len == 1) 
			{ 
		
				System.out.println(single_digits[num[0] - '0']); 
				return; 
			} 

		
			int x = 0; 
			while (x < num.length) 
			{ 

				/* Code path for first 2 digits */
				if (len == 3) 
				{ 
					if (num[x]-'0' != 0) 
					{ 
						System.out.print(single_digits[num[x] - '0']+" "); 
						System.out.print(tens_power[len - 3]+" "); 
						
					} 
					--len; 
				} 

				/* Code path for last 2 digits */
				else
				{ 
					/* Need to explicitly handle 
					10-19. Sum of the two digits 
					is used as index of "two_digits" 
					array of strings */
					if (num[x] - '0' == 1) 
					{ 
						int sum = num[x] - '0' + 
							num[x] - '0'; 
						System.out.println(two_digits[sum]); 
						return; 
					} 

					/* Need to explicitely handle 20 */
					else if (num[x] - '0' == 2 && 
							num[x + 1] - '0' == 0) 
					{ 
						System.out.println("twenty"); 
						return; 
					} 

					/* Rest of the two digit 
					numbers i.e., 21 to 99 */
					else
					{ 
						int i = (num[x] - '0'); 
						if(i > 0) 
						System.out.print(tens_multiple[i]+" "); 
						else
						System.out.print(""); 
						++x; 
						if (num[x] - '0' != 0) 
							System.out.println(single_digits[num[x] - '0']); 
					} 
				} 
				++x; 
			} 
		}

	
}
