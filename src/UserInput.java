import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void userInputDisplay() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character:");
		char ch = (char)br.read();
		System.out.println("Entered data is: "+ch);
	}
}
