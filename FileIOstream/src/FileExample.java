import java.io.*;
public class FileExample {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("Source1.txt");
		FileOutputStream fos = new FileOutputStream("Source2.txt");
		
		int b;
		
		try {
			
		
		while((b = fis.read())!= -1 )
		{
			if(b>=65 && b<=90) fos.write(b+32);
			else fos.write(b);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		fos.close();
		fis.close();
		
		

	}

}
