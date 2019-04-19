package persistent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharSeqInString {

	public static void main(String[] args) 
	{
		Scanner readinput=new Scanner(System.in);
		System.out.println("Enter the string");
		String inputstring=readinput.nextLine();
		//String inputstring="aaa ddd gggg";
		Map map=new HashMap();
		System.out.println(inputstring.length());
		for(int i=0;i<inputstring.length();i++)
		{
			
			char ch=inputstring.charAt(i);
			
			if(map.containsKey(ch))
			{
				int count=(int) map.get(ch);
				map.put(ch,++count);
			}
			else
			{
				map.put(ch,1); 
			}
		}
		System.out.println(map);
	}
}
