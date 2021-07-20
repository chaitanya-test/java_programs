import java.io.*;
import java.util.*;

class string_menu_option{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the string : ");
		String str = s.nextLine();
		System.out.println("\n1: Original String"+"\n2: String Length"+"\n3: Word Count"+"\n4: Reverse the whole String"+"\n5: Reverse Only Words"+"\n6: Reverse only String"+"\n7 :  Check if Pallindrome"+"\n8:String word occurence");
		System.out.println("n Enter your Choic: ");
		int switch_case= s.nextInt();
		
		switch(switch_case)
		{
			case 1 : System.out.println(str);
					 break;
			
			case 2 : int length = string_length(str);
					 System.out.println("Length is : "+length);
					 break;
			
			case 3 : int word_count = count_the_words(str);
					 System.out.println("\n Count is : "+word_count);
			         break;
					 
			case 4 : string_reverse(str);
					 break;
			
			case 5 : reverse_only_word(str);
					 break;
			
			case 6  :reverse_only_string_sequence(str);
					 break;
			
			case 7  :pallindrome(str);
					 break;
					 
			case 8 :word_count_occurence(str);
					break;
					 
			
		}
		
	}
	
    public static int string_length(String str){
		int i=0;
		for(char c: str.toCharArray())
		{
			i++;
		}
			
		return i;
	}
	
	public static void string_reverse(String str){
		int length = string_length(str);
		String rev = "";
		for(int i=length-1;i>=0;i--){
		rev=rev+str.charAt(i);
		//System.out.print(str.charAt(i));
		}
		
		System.out.print("Reversed string is : "+rev);
		
	}
	
	public static int count_the_words(String str)
	{
		int count=1;
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!= ' ')
			{
				count++;
			}
		}
		return count;
	}
	
	public static void reverse_only_word(String str)
	{
			System.out.println("In Progress");
		
	}
	
	public static void reverse_only_string_sequence(String str)
	{
			String a[] = str.split(" ");
			int length=a.length;
			System.out.println("Length is : ");
			for(int i=length-1;i>=0;i--)
			{
				System.out.print(a[i]+ " ");
			}
			
	}
	
	public static void pallindrome(String str)
	{
		String rev = "";
		int length = str.length();
		for(int i=0;i<length;i++)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
	}
	
	public static void word_count_occurence(String str)
	{
		String s[] = str.split(" ");
		int length = s.length;
		for(int i=0;i<length;i++)
		{
			int count=1;
			for(int j=i+1;j<length;j++)
			{
				
				if(s[i].equals(s[j]))				
				{
					count=count+1;
					s[j]="0";
				}
			}
		
			if(s[i]!="0")
			{
				System.out.println(s[i] + "  " +count);
			}
		}
	}
	
	
}

		
		














