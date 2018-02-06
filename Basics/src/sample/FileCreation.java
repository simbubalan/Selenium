package sample;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreation 
{
	public static void main(String[] args)
	{
		//------------------------------------------------------------------------------------------------------------------------
		// CODE FOR CREATING A FILE
		
		String s = "note.xls";
		System.out.println("PROGRAM BEGIN");
		 try 
		 {
			
			File file = new File(s); // CREATES NEW FILE in Package location (C:\Users\Cigniti_1931\Downloads\LocalGit\Basics)
			if(!file.exists())
			file.createNewFile();
			
			PrintWriter pw = new PrintWriter(file); // WRITES DATA into the FILE CREATED
			pw.println("TEST"); 
			//System.out.println("File being opened");
			pw.println("LINE"); 
			//System.out.println("File being written");
			pw.close();
			
		 }
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		 finally
			{
			// System.out.println("File being Closed");
			}
		
		
	//------------------------------------------------------------------------------------------------------------------------
	// CODE FOR READING FROM FILE
		 
		BufferedReader br = null;
		String line;
		
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Cigniti_1931\\Downloads\\LocalGit\\Basics\\"+s));
			while((line=br.readLine()) != null)
			{System.out.println(line);}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("FILE HAS BEEN READED COMPLETELY");
			System.out.println("PROGRAM END");
		}
	
	}
}
	

