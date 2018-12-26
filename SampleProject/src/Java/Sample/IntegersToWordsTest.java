package Java.Sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegersToWordsTest {

	
	
	@Test
	public void testconvertIntegersToWords()
	{
		IntergersToWords.convertIntegersToWords("234".toCharArray());
	    assertEquals("two hundred thirty four", "two hundred thirty four"); 
	    
	    
	}

	
	
}
