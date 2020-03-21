import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
	
	public void writeIntoText () throws IOException
	{
		DataInputStream is = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\MyPC\\Desktop\\Java_Handsop\\OutputFiles\\test.txt");
		System.out.println("Enter Input: ");
		char inputData;
		do
		{
			inputData = (char) is.read();
			fout.write(inputData);
		} while (inputData != '@');
		fout.close();
		
	}
	
	public void fileWriterMethod() throws IOException
	{
		String str = "Hello Everyone";
		FileWriter fw = new FileWriter("C:\\Users\\MyPC\\Desktop\\Java_Handsop\\OutputFiles\\Test2.txt");
		/*for (int i=0; i<str.length(); i++)
		{
			fw.write(str.charAt(i));
		}*/
		fw.write(str);
		fw.close();
		
	}
	
	public void BufferedMethods() throws IOException
	{
		//String str = "Hello Everyone. Testing for Buffered";
		FileReader fr = new FileReader("C:\\Users\\MyPC\\Desktop\\Java_Handsop\\OutputFiles\\Test2.txt");
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
	}

}
