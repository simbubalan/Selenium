package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date.toString());
		
		System.out.print("\n"+"Current Date is "); System.out.println(date.getDate());
		System.out.print("Current Month is "); System.out.println(date.getMonth()+1); // we have add +1 for month
		System.out.print("Current Year is "); System.out.println(date.getYear()+1900); // we have add +1900 for year
		System.out.print("Current Time is "); System.out.println(date.getHours());
		
		SimpleDateFormat FT = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("\n"+"Current Date: " + FT.format(date));
	}

}
