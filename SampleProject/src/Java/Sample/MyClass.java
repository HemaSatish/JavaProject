package Java.Sample;
import java.io.IOException;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


System.out.println("Enter any integer values between 1 to 999 :\n");
try
{
Scanner in=new Scanner(System.in);

int num = in.nextInt('\n');
char[]  number =Integer.toString(num).toCharArray();
if(num == 0)
	System.exit(1);
else
IntergersToWords.convertIntegersToWords(number);
}
catch(Exception e)
{
System.out.println( "Invalid number" ) ;
}

}
}
